package ar.edu.ubp.das.appref;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Item> items;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    public void imprimirFactura() {
        imprimirCliente();
        imprimirItems();
        System.out.println("Total: $" + calcularTotal());
    }

    private void imprimirCliente() {
        System.out.println("Cliente: " + cliente);
    }

    private void imprimirItems() {
        System.out.println("Ítems:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Roberto");
        Factura factura1 = new Factura(cliente1);
        
        Item item1 = new Item("Laptop", 1500);
        Item item2 = new Item("Mouse", 25);
        
        factura1.agregarItem(item1);
        factura1.agregarItem(item2);
        
        factura1.imprimirFactura();
    }
}
