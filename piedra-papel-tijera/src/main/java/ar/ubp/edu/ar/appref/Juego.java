package ar.edu.ubp.das.appref;

public class Juego {

    private static Opcion resultados[] = { new OpcionPiedra(), new OpcionPapel(), new OpcionTijera() };

    public static void main(String args[]) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        boolean termino = false;

        int valor;
        Opcion selJ1, selJ2;
        int resultado;

        do {
            System.out.println("Elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
            valor = Consola.readInt();
            while(!(valor >= 0 && valor < 3)) {
                System.out.print("La opción no es válida. Recuerda, elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
                valor = Consola.readInt();
            }
            selJ1 = resultados[valor];
            selJ2 = resultados[j2.getResultado()];

            System.out.println("Jugador 1: " + selJ1);
            System.out.println("Jugador 2: " + selJ2);

            resultado = selJ1.jugar(selJ2);
            if(resultado > 0) {
                j2.setGanados();
                System.out.println("Perdiste");
            }
            else if(resultado < 0) {
                j1.setGanados();
                System.out.println("Ganaste");
            }
            else {
                System.out.println("Empate");
            }

            System.out.println();
            System.out.println("Ganados Jugador 1: " + j1.getGanados());
            System.out.println("Ganados Jugador 2: " + j2.getGanados());

            if(j1.getGanados() == 3 || j2.getGanados() == 3) {
                termino = true;
                System.out.println(j1.getGanados() == 3 ? "GANASTE! :)" : "PERDISTE! :(");
            }
            System.out.println();
        }
        while(!termino);
    }

}

