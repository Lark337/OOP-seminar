package seminar6.report.impl;

import seminar6.report.Reportable;
import seminar6.User;

public class UserRerport implements Reportable<User> {
    @Override
    public void report(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
