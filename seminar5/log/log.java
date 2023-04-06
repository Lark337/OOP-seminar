package seminar5.log;

import seminar5.controller.UserController;
import seminar5.model.User;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class log {

    private final String fileName;
    private final Logger logger;
    private FileHandler fHandler;

    public log() {
        this.fileName = "seminar5/log.txt";
        this.logger = Logger.getLogger(UserController.class.getName());
        try {
            this.fHandler = new FileHandler(fileName,true);
            logger.addHandler(fHandler);
            logger.setUseParentHandlers(false);
            fHandler.setFormatter(new SimpleFormatter());            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                
    }

    public log (String path){
        String filepath = String.format("%s/log.txt",path );
        this.fileName = filepath;
        this.logger = Logger.getLogger(UserController.class.getName());
        try {
            this.fHandler = new FileHandler(fileName,true);
            logger.addHandler(fHandler);
            logger.setUseParentHandlers(false);
            fHandler.setFormatter(new SimpleFormatter());            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void save(User user){
        logger.log(Level.INFO,user.toString());
        
    }
    public void save(User user, String info){
        logger.log(Level.INFO,String.format("Действие:%s\n%s",info,user.toString()));

    }
    public void save(String info){
        logger.log(Level.INFO,info);
    }
    
}
