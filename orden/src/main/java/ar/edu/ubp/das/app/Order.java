package ar.edu.ubp.das.app;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private String customerEmail;
    private List<String> items;
    private double totalPrice;

    public Order(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public void removeItem(String item, double price) {
        if (items.contains(item)) {
            items.remove(item);
            totalPrice -= price;
        }
    }

    public void printOrderDetails() {
        System.out.println("Customer: " + customerName + " - " + customerEmail);
        System.out.println("Items: ");
        for (String item : items) {
            System.out.println(" - " + item);
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public void sendOrderConfirmationEmail() {
        System.out.println("Sending confirmation email to: " + customerEmail);
        // Simulando envío de email
    }

    public static void main(String[] args) {
    }
}