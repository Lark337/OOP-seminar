package seminar7.Note;

public class Note {
    private Long id;
    private String title;
    private String text;

    public Note(String title,String text){
        this.title = title;
        this.text = text;
    }

    public Note(Long id, String title, String text){
        this(title, text);
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getText() {
        return text;
    }
    
    public Long getId() {
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Id: %d; Title: %s; Text: %s", getId(),getTitle(),getText());
    }
}
