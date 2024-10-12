package ar.edu.ubp.das.appref;

public class EmailService {
    private Customer customer;

    public EmailService(Customer customer){
        this.customer = customer;
    }

    public void sendOrderConfirmationEmail() {
        System.out.println("Sending confirmation email to: " + customer.getEmail());
    }
}
