package ar.edu.ubp.das.appref;

public class CreditCardPayment extends PaymentMethod {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for amount: $" + amount);
        System.out.println("Using credit card number: " + creditCardNumber);
    }
}