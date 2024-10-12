package ar.ubp.edu.ar.app;

public class Jugador {

    String resultados[] = { "PIEDRA", "PAPEL", "TIJERA" };
    int g;

    public String getResultado() {
        String resultado = "";
        int i = (int)(Math.random() * 3);
        switch(i) {
            case 0:
                resultado = "PIEDRA";
                break;
            case 1:
                resultado = "PAPEL";
                break;
            case 2:
                resultado = "TIJERA";
                break;
        }
        return resultado;
    }

    public int getGanados() {
        return g;
    }
}