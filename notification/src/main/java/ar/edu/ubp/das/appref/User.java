package ar.edu.ubp.das.appref;

public class User {
    private String email;

    public User(String email){
        this.email = email;
    }

    public void notifyUser(String message) {
        System.out.println(message + ": " + email);
    }
}
