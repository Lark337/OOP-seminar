package seminar7.repository.impl;

import seminar7.repository.BDrepository;

import java.util.ArrayList;
import java.util.List;

import seminar7.Dbase.impl.NoteBD;
import seminar7.Note.Note;
import seminar7.mapper.impl.NoteMapper;;

public class NoteRepository implements BDrepository<Note,Long> {
    private final NoteMapper mapper;
    private final NoteBD bd;

    public NoteRepository(NoteBD bd) {
        this.mapper = new NoteMapper();
        this.bd = bd;
    }

    @Override
    public List<Note> findAll() {
        List<String> lines = bd.readAll();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.toOutput(line));
        }
        return notes;
    }

    @Override
    public Note create(Note note) {
        List<Note> notes = findAll();
        long max = 0L;
        for (Note n : notes) {
            long id = n.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        note.setId(next);
        notes.add(note);
        List<String> lines = new ArrayList<>();
        for (Note u: notes) {
            lines.add(mapper.toInput(u));
        }
        bd.saveAll(lines);
        return note;
    }

    @Override
    public Note update(Long id, Note update) {
        try {
            List<Note> notes = findAll();
            Note updateNote = notes.stream().filter(n -> n.getId().equals(id)).findFirst().get();
            updateNote.setTitle(update.getTitle());
            updateNote.setText(update.getText());
            List<String> list = new ArrayList<>();
            for(Note note: notes) {
                list.add(mapper.toInput(note));
            }
            bd.saveAll(list);
            return updateNote;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Long id) {
        List<Note> notes = findAll();
        Note noteForDelete = notes.stream().filter(n -> n.getId().equals(id)).findFirst().get();
        notes.remove(noteForDelete);
        List<String> list = new ArrayList<>();
            for(Note note: notes) {
                list.add(mapper.toInput(note));
            }
        bd.saveAll(list);
        return true;
    }

    @Override
    public Note findById(Long id){
        List<Note> notes = findAll();
        Note note = notes.stream().filter(n -> n.getId().equals(id)).findFirst().get();
        return note;
    }
}
