package ar.edu.ubp.das.app;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;

    public Persona(String nombre, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Roberto", 27, "Calle Falsa 123", "123456789");
        Persona persona2 = new Persona("María", 17, "Calle Verdadera 456", "987654321");

        persona1.imprimirDatos();
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());

        persona2.imprimirDatos();
        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());
    }
}
