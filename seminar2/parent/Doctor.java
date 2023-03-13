package seminar2.parent;

public class Doctor {
    private String secondName;
    private String firstName; 

public Doctor(String firstName, String secondName ){
    this.secondName = secondName;
    this.firstName = firstName;
}
public String getFirstName(){
    return firstName;
}
public String getSecondName(){
    return secondName;
}

@Override
    public String toString() {
        return String.format("%s %s\n", getFirstName(), getSecondName());
    }
}