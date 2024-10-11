package ar.edu.ubp.das.appref;

public class Item {
    private String nombre;
    private double precio;

    public Item(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + " - Precio: $" + precio;
    }
}