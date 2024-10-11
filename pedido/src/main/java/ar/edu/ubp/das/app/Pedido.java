package ar.edu.ubp.das.app;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private String direccion;
    private List<String> productos;
    private List<Double> precios;

    public Pedido(String cliente, String direccion) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
        this.precios = new ArrayList<>();
    }

    public void agregarProducto(String producto, double precio) {
        productos.add(producto);
        precios.add(precio);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (double precio : precios) {
            total += precio;
        }
        return total;
    }

    public void imprimirDetalles() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Dirección: " + direccion);
        System.out.println("Productos:");
        for (String producto : productos) {
            System.out.println(producto);
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Roberto", "Calle Falsa 123");
        pedido.agregarProducto("Producto A", 10.50);
        pedido.agregarProducto("Producto B", 5.75);
        pedido.imprimirDetalles();
    }
}
