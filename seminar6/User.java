package seminar6;

import seminar6.report.impl.UserRerport;

public class User{
    private final String name;
    private final UserRerport report;

    public User(String name){
        this.name = name;
        this.report = new UserRerport();
    }

    public String getName(){
        return name;
    }

    public void report(){
        report.report(this);
    }

}
