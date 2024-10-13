package ar.edu.ubp.das.appref;

public class OpcionPiedra extends Opcion {

    @Override
    public int jugar(Opcion opcion) {
        if(opcion instanceof OpcionPapel)
            return 1;
        else if(opcion instanceof OpcionPiedra)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "PIEDRA";
    }

}
