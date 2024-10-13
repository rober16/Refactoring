package ar.edu.ubp.das.appref;

public class OpcionPapel extends Opcion {

    @Override
    public int jugar(Opcion opcion) {
        if(opcion instanceof OpcionTijera)
            return 1;
        else if(opcion instanceof OpcionPapel)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "PAPEL";
    }

}
