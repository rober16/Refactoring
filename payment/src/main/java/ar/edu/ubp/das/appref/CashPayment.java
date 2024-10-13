package ar.edu.ubp.das.appref;

public class CashPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment for amount: $" + amount);
    }
}