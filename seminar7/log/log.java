package seminar7.log;

import seminar7.controller.NoteController;
import seminar7.Note.Note;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class log {

    private final String fileName;
    private final Logger logger;
    private FileHandler fHandler;

    public log() {
        this.fileName = "seminar7/log.txt";
        this.logger = Logger.getLogger(NoteController.class.getName());
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
        this.logger = Logger.getLogger(NoteController.class.getName());
        try {
            this.fHandler = new FileHandler(fileName,true);
            logger.addHandler(fHandler);
            logger.setUseParentHandlers(false);
            fHandler.setFormatter(new SimpleFormatter());            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void save(Note note){
        logger.log(Level.INFO,note.toString());
        
    }
    public void save(Note note, String info){
        logger.log(Level.INFO,String.format("Действие:%s\n%s",info,note.toString()));

    }
    public void save(String info){
        logger.log(Level.INFO,info);
    }
    
}
