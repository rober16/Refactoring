package ar.edu.ubp.das.appref;

public class PayPalPayment extends PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment for amount: $" + amount);
        System.out.println("Sending payment to PayPal email: " + email);
    }
}