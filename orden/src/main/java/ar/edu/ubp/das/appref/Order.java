package ar.edu.ubp.das.appref;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Item> items;
    private EmailService emailService;

    public Order(Customer customer, EmailService emailService) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.emailService = emailService;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }

    public void printOrderDetails() {
        System.out.println("Customer: " + customer.getName() + " - " + customer.getEmail());
        System.out.println("Items: ");
        double totalPrice = 0.0;
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
            totalPrice += item.getPrice();
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public void notifyCustomer() {
        emailService.sendOrderConfirmationEmail();
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Roberto", "robi172015@gmail.com");
        Item item1 = new Item("Laptop", 1500);
        Item item2 = new Item("Mouse", 25);

        EmailService emailService = new EmailService(customer);
        Order order = new Order(customer, emailService);

        order.addItem(item1);
        order.addItem(item2);
        order.removeItem(item2);
        order.printOrderDetails();   
        
        order.notifyCustomer();
    }
}