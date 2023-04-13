package seminar7;

import seminar7.Dbase.impl.NoteBD;
import seminar7.controller.NoteController;
import seminar7.repository.impl.NoteRepository;
import seminar7.view.NoteView;

public class Main {
    public static void main(String[] args) {
        NoteBD NoteBD = new NoteBD("BDNoteses");
        NoteRepository repository = new NoteRepository(NoteBD);
        NoteController controller = new NoteController(repository);
        NoteView view = new NoteView(controller);
        view.run();
    }
}
