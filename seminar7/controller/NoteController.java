package seminar7.controller;

import seminar7.Note.Note;
import seminar7.repository.impl.NoteRepository;
import seminar7.log.log;

import java.util.List;
import java.util.Objects;



public class NoteController {
    private final NoteRepository repository;
    private log log;



    public NoteController(NoteRepository repository) {
        this.repository = repository;
        this.log = new log();
    }

    public void saveNote(Note note) {
        repository.create(note);
        log.save(note,"Создание записки");
        
    }

    public Note readNote(Long noteId) throws Exception {
        List<Note> notes = repository.findAll();
        for (Note note : notes) {
            if (Objects.equals(note.getId(), noteId)) {
                log.save(note,"Поиск записки:");
                return note;
            }
        }
        log.save(String.format("Поиск контакта, контакт под id %d не найден",noteId));
        throw new RuntimeException("Note not found");
    }


    public List<Note> getAllNotes() {
        List<Note> res = repository.findAll();
        log.save("Просмотр списка контакт");
        return res;
    }

    public boolean noteUpdate(long id, Note update) {
        try {
            log.save(update, String.format("Обновление записки\n%s\nна ", readNote(id).toString(),update.toString()));
            repository.update(id, update);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void deleteNote(Long id){
        log.save(repository.findById(id), "Удаление записки:");
        repository.delete(id);
    }
}
