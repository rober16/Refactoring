package ar.edu.ubp.das.app;

public class Payment {
    private String paymentType;  // Puede ser "CreditCard", "PayPal", "Cash"
    private String creditCardNumber;
    private String email;

    public Payment(String paymentType, String creditCardNumber, String email) {
        this.paymentType = paymentType;
        this.creditCardNumber = creditCardNumber;
        this.email = email;
    }

    public void processPayment(double amount) {
        switch (paymentType) {
            case "CreditCard":
                System.out.println("Processing credit card payment for amount: $" + amount);
                System.out.println("Using credit card number: " + creditCardNumber);
                break;
            case "PayPal":
                System.out.println("Processing PayPal payment for amount: $" + amount);
                System.out.println("Sending payment to PayPal email: " + email);
                break;
            case "Cash":
                System.out.println("Processing cash payment for amount: $" + amount);
                break;
            default:
                System.out.println("Invalid payment method.");
        }
    }

    public void notifyCustomer() {
        Customer customer = new Customer();
        customer.sendNotification(this, "Your payment has been processed.");
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        Payment payment1 = new Payment("CreditCard", "1234-5678-9876-5432", null);
        payment1.processPayment(100);

        Payment payment2 = new Payment("PayPal", null, "customer@example.com");
        payment2.processPayment(50);

        Payment payment3 = new Payment("Cash", null, null);
        payment3.processPayment(20);
    }
}

class Customer {
    public void sendNotification(Payment payment, String message) {
        System.out.println("Notification sent to customer regarding " + payment.getPaymentType() + ": " + message);
    }
}