package ar.edu.ubp.das.appref;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Factura {
    private Cliente cliente;
    private LinkedList<Tarifa>  tarifas;
    private LinkedList<Entrada> entradas;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
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

        Entrada entrada = new Entrada(t, horaDesde, horaHasta, horaHasta);
        this.entradas.add(entrada);
    }

    public void mostrarFactura() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();
        double totalPagar = 0d;

        System.out.println("**************************************************************");
        System.out.println("DATOS DE LA FACTURA");
        System.out.println("**************************************************************");
        System.out.println("Fecha: " + formato.format(fecha));
        cliente.mostrarDatosClientes();
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("ENTRADAS");
        System.out.println("**************************************************************");
        for(Entrada e : this.entradas) {
            totalPagar += e.getCosto();

            System.out.println(e.getTarifa().getTipo() + " " + e.getCosto());
            System.out.println(e.getHoraDesde() + " " + e.getHoraHasta());
        }
        System.out.println("**************************************************************");
        System.out.println("TOTAL A PAGAR: " + totalPagar);
        System.out.println("**************************************************************");
    }
}
