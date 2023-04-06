package seminar5;

import seminar5.controller.UserController;
import seminar5.dao.impl.FileOperation;
import seminar5.model.User;
import seminar5.repository.GBRepository;
import seminar5.repository.impl.UserRepository;
import seminar5.view.UserView;

import static seminar5.util.DBConnector.DB_PATH;
import static seminar5.util.DBConnector.createDB;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
        
    }
}
