package seminar7.view;

import java.util.List;
import java.util.Scanner;

import seminar7.Note.Note;
import seminar7.controller.NoteController;
import seminar7.util.Commands;

public class NoteView {

    private final NoteController noteController;

    public NoteView(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run(){
        Commands com;
        while(true){
            String command = prompt("Введите комманду: CREATE, UPDATE, READ, LIST, DELETE, EXIT\n");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String title = prompt("Тема: ");
                    String text = prompt("Текст: ");
                    noteController.saveNote(new Note(title, text));
                    break;
            
                case UPDATE:
                    long userId = Long.parseLong(prompt("Input note id: "));
                    String updateTitle = prompt("Title: ");
                    String updateText = prompt("Text: ");
                    Note updatedNote = new Note(updateTitle, updateText);
                    noteController.noteUpdate(userId, updatedNote);
                    break;
                
                case READ:
                    String id = prompt("Input note id: ");
                    try {
                        Note note = noteController.readNote(Long.parseLong(id));
                        System.out.println(note);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case LIST:
                    List<Note> notes = noteController.getAllNotes();
                    for(Note note: notes) {
                        System.out.println(note);
                    }
                    break;
                case DELETE:
                    String idForDelete = prompt("Input note id: ");
                    noteController.deleteNote(Long.parseLong(idForDelete));
                    break;
                    
            }
        }

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
