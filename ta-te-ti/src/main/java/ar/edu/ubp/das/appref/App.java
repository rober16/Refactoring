package ar.edu.ubp.das.appref;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Juguemos al TA-TE-TI");
        Jugador jugador1 = obtenerJugador(in, "1", 'X');
        Jugador jugador2 = obtenerJugador(in, "2", 'O');
        
        boolean turnoJugador1 = true;
        boolean fin = false;
        
        while (!fin) {
            tablero.imprimirTablero();
            Jugador jugadorActual = turnoJugador1 ? jugador1 : jugador2;
            System.out.println("Turno de " + jugadorActual.getNombre() + " (" + jugadorActual.getSimbolo() + "):");
            
            Posicion posicion = obtenerPosicion(in, tablero);
            tablero.marcarCasilla(posicion, jugadorActual.getSimbolo());
            
            if (tablero.gano(jugadorActual.getSimbolo())) {
                System.out.println("¡" + jugadorActual.getNombre() + " ganó! :D");
                fin = true;
            } else if (tablero.estaLleno()) {
                System.out.println("No hay más posiciones");
                fin = true;
            } else {
                turnoJugador1 = !turnoJugador1;
            }
        }
        
        tablero.imprimirTablero();
        in.close();
    }

    private static Jugador obtenerJugador(Scanner in, String numero, char simbolo) {
        System.out.print("Nombre del jugador " + numero + ": ");
        return new Jugador(in.nextLine(), simbolo);
    }

    private static Posicion obtenerPosicion(Scanner in, Tablero tablero) {
        while (true) {
            try {
                System.out.print("Ingresa la fila (0, 1, ó 2): ");
                int fila = Integer.parseInt(in.nextLine().trim());
                System.out.print("Ingresa la columna (0, 1, ó 2): ");
                int columna = Integer.parseInt(in.nextLine().trim());
                Posicion posicion = new Posicion(fila, columna);
                
                if (!tablero.esPosicionValida(posicion)) {
                    System.out.println("La posición no es válida, vuelve a intentar");
                } else if (tablero.esCasillaOcupada(posicion)) {
                    System.out.println("La posición ya fue elegida, vuelve a intentar");
                } else {
                    return posicion;
                }
            } catch (NumberFormatException ex) {
                System.out.println("El valor ingresado no es \"ENTERO\", vuelve a intentar");
            }
        }
    }
}