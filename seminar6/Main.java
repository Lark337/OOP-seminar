package seminar6;


public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report();
        UserSave.save(user);
    }
}