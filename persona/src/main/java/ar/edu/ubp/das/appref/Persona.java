package ar.edu.ubp.das.appref;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;
    private Telefono telefono;

    public Persona(String nombre, int edad, Direccion direccion, Telefono telefono) {
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
        
        if (this.edad >= 18) {
            System.out.println("Es mayor de edad");
        }
    }

    public static void mostrarPersona(Persona persona) {
        persona.imprimirDatos();
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Roberto", 27, new Direccion("Argüello Donato Alvarez 380"), new Telefono("1234566"));
        Persona persona2 = new Persona("Maria", 93, new Direccion("Argüello Donato Alvarez 380"), new Telefono("987654321"));

        mostrarPersona(persona1);
        mostrarPersona(persona2);
    }
}