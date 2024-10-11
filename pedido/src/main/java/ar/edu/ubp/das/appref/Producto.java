package ar.edu.ubp.das.appref;

public class Producto {
    private String producto;
    private Double precio;

    public Producto(String producto, Double precio){
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public String toString() {
        return producto + " - Precio: $" + precio;
    }
}
