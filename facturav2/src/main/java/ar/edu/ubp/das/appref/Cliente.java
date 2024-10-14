package ar.edu.ubp.das.appref;

public class Cliente {
    private String 	apellidoCliente;
    private String	nombreCliente;
    private String	docCliente;

    public String getApellidoCliente() {
        return apellidoCliente;
    }
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getDocCliente() {
        return docCliente;
    }
    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }
    public Cliente(String apellidoCliente, String nombreCliente, String docCliente) {
        this.apellidoCliente = apellidoCliente;
        this.nombreCliente = nombreCliente;
        this.docCliente = docCliente;
    }   
    
    public void mostrarDatosClientes(){
        System.out.println("Cliente: " + this.getApellidoCliente() + ", " + this.getNombreCliente() + " - Documento: " + this.getDocCliente());
    }
}
