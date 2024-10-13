package ar.edu.ubp.das.appref;

public class OpcionTijera extends Opcion {

    @Override
    public int jugar(Opcion opcion) {
        if(opcion instanceof OpcionPiedra)
            return 1;
        else if(opcion instanceof OpcionTijera)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "TIJERA";
    }

}
