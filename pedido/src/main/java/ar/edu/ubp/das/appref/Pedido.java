package ar.edu.ubp.das.appref;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Direccion direccion;
    private List<Producto> productos;

    public Pedido(Cliente cliente, Direccion direccion) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void imprimirDetalles() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Dirección: " + direccion);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(producto.getProducto() + " - $" + producto.getPrecio());
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto");
        Direccion direccion = new Direccion("Donato Alvarez 1234");
        Producto producto = new Producto("Heladera", 25.000);

        Pedido pedido = new Pedido(cliente, direccion);
        pedido.agregarProducto(producto);
        //Pedido pedido = new Pedido("Roberto", "Calle Falsa 123");
        //pedido.agregarProducto("Producto A", 10.50);
        //pedido.agregarProducto("Producto B", 5.75);
        pedido.imprimirDetalles();
    }
}
