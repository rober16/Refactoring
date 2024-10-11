package ar.edu.ubp.das.appref;

public class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return direccion;
    }
}