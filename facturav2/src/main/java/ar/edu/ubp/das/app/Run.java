package ar.edu.ubp.das.app;

import java.util.Date;

public class Run {

    // NO CONSIDERAR PARA REFACTORIZAR
    public static void main(String[] args) {
        Factura f = new Factura(new Date(), "PASTARINI", "MARIELA", "1234567890");
        f.addTarifa("NORMAL", 2500);
        f.addTarifa("NIÑOS", 1500);
        f.addTarifa("JUBILADOS", 1000);

        f.addEntrada("NORMAL", 1000, 1200);
        f.addEntrada("NORMAL", 1000, 1200);
        f.addEntrada("NORMAL", 1000, 1200);

        f.mostrarFactura();
    }

}
