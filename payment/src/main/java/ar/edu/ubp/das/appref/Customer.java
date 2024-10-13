package ar.edu.ubp.das.appref;

public class Customer {
    private String email;

    public Customer(String email) {
        this.email = email;
    }

    public void notify(String message) {
        System.out.println("Notification sent to " + email + ": " + message);
    }
}