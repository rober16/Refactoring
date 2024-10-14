package ar.edu.ubp.das.appref;

public class Run {

    // NO CONSIDERAR PARA REFACTORIZAR
    public static void main(String[] args) {
        Cliente cliente = new Cliente("PASTARINI", "MARIELA", "1234567890");
        Factura f = new Factura(cliente);
        f.addTarifa("NORMAL", 2500);
        f.addTarifa("NIÑOS", 1500);
        f.addTarifa("JUBILADOS", 1000);

        f.addEntrada("NORMAL", 1000, 1200);
        f.addEntrada("NORMAL", 1000, 1200);
        f.addEntrada("NORMAL", 1000, 1200);

        f.mostrarFactura();
    }

}
