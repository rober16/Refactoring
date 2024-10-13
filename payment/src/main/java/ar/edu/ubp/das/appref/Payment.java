package ar.edu.ubp.das.appref;

public class Payment {
    private PaymentMethod paymentMethod;
    private Customer customer;

    public Payment(PaymentMethod paymentMethod, Customer customer) {
        this.paymentMethod = paymentMethod;
        this.customer = customer;
    }

    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
        customer.notify("Your payment of $" + amount + " has been processed.");
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("customer1@example.com");
        PaymentMethod creditCard = new CreditCardPayment("1234-5678-9876-5432");
        Payment payment1 = new Payment(creditCard, customer1);
        payment1.processPayment(100);

        Customer customer2 = new Customer("customer2@example.com");
        PaymentMethod payPal = new PayPalPayment("customer2@example.com");
        Payment payment2 = new Payment(payPal, customer2);
        payment2.processPayment(50);

        Customer customer3 = new Customer("customer3@example.com");
        PaymentMethod cash = new CashPayment();
        Payment payment3 = new Payment(cash, customer3);
        payment3.processPayment(20);
    }
}