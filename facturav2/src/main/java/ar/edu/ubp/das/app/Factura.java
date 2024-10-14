package ar.edu.ubp.das.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Factura {

    private Date 	            fecha;
    private String 	            apellidoCliente;
    private String	            nombreCliente;
    private String				docCliente;
    private LinkedList<Tarifa>  tarifas;
    private LinkedList<Entrada> entradas;

    public Factura(Date fecha, String apellidoCliente, String nombreCliente, String docCliente) {
        this.fecha           = fecha;
        this.apellidoCliente = apellidoCliente;
        this.nombreCliente   = nombreCliente;
        this.docCliente      = docCliente;
        this.tarifas = new LinkedList<Tarifa>();
        this.entradas = new LinkedList<Entrada>();
    }

    public void addTarifa(String tipoTarifa, double costo) {
        this.tarifas.add(new Tarifa(tipoTarifa, costo));
    }

    public Tarifa getTarifa(String tipoTarifa) {
        for(Tarifa t : this.tarifas) {
            if(t.getTipo().equals(tipoTarifa)) {
                return t;
            }
        }
        return null;
    }

    public void addEntrada(String tipoTarifa, int horaDesde, int horaHasta) {
        Tarifa  t = this.getTarifa(tipoTarifa);
        if(t == null)
            return;

        Entrada e = new Entrada();
        e.tarifa    = t;
        e.horaDesde = horaDesde;
        e.horaHasta = horaHasta;
        e.costo     = t.getCosto();
        this.entradas.add(e);
    }

    public void mostrarFactura() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        double totalPagar = 0d;

        System.out.println("**************************************************************");
        System.out.println("DATOS DE LA FACTURA");
        System.out.println("**************************************************************");
        System.out.println("Fecha: " + formato.format(this.fecha));
        System.out.println("Cliente: " + this.apellidoCliente + ", " + this.nombreCliente + " - Documento: " + this.docCliente);
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("ENTRADAS");
        System.out.println("**************************************************************");
        for(Entrada e : this.entradas) {
            totalPagar += e.costo;

            System.out.println(e.tarifa.getTipo() + " " + e.costo);
            System.out.println(e.horaDesde + " " + e.horaHasta);
        }
        System.out.println("**************************************************************");
        System.out.println("TOTAL A PAGAR: " + totalPagar);
        System.out.println("**************************************************************");
    }

}
