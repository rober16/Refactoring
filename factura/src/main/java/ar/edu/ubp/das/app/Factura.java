package ar.edu.ubp.das.app;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String cliente;
    private List<String> items;
    private List<Double> precios;

    public Factura(String cliente) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
        this.precios = new ArrayList<>();
    }

    public void agregarItem(String item, double precio) {
        this.items.add(item);
        this.precios.add(precio);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < precios.size(); i++) {
            total += precios.get(i);
        }
        return total;
    }

    public void imprimirFactura() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Items comprados:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " - $" + precios.get(i));
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public static void main(String[] args) {
        Factura factura = new Factura("Roberto");
        factura.agregarItem("Monitor", 250.0);
        factura.agregarItem("Teclado", 100.0);
        factura.agregarItem("Mouse", 50.0);
        
        factura.imprimirFactura();
    }
}
