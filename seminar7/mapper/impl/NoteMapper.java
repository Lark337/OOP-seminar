package seminar7.mapper.impl;

import seminar5.mapper.Mapper;
import seminar7.Note.Note;

public class NoteMapper implements Mapper<Note,String> {
    @Override
    public String toInput(Note e) {
        return String.format("%s;%s;%s", e.getId(),e.getTitle(),e.getText());
    }

    @Override
    public Note toOutput(String s) {
        String[] lines = s.split(";");
        long id;
        if (isDigit(lines[0])) {
            id = Long.parseLong(lines[0]);
            return new Note(id, lines[1], lines[2]);
        }
        throw new NumberFormatException("Id must be a large number");
    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
