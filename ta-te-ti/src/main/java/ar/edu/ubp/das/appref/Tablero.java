package ar.edu.ubp.das.appref;

public class Tablero {
    private char[][] tablero;

    public Tablero() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero(){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public boolean gano(char simbolo) {
        // Verifica filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
        }
        // Verifica columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == simbolo && tablero[1][j] == simbolo && tablero[2][j] == simbolo) {
                return true;
            }
        }
        // Verifica diagonales
        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
            return true;
        }
        if (tablero[2][0] == simbolo && tablero[1][1] == simbolo && tablero[0][2] == simbolo) {
            return true;
        }
        return false;
    }

    public void marcarCasilla(Posicion posicion, char simbolo) {
        tablero[posicion.getFila()][posicion.getColumna()] = simbolo;
    }

    public boolean estaLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean termino() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean esPosicionValida(Posicion posicion) {
        return posicion.getFila() >= 0 && posicion.getFila() < 3 && posicion.getColumna() >= 0 && posicion.getColumna() < 3;
    }

    public boolean esCasillaOcupada(Posicion posicion) {
        return tablero[posicion.getFila()][posicion.getColumna()] != '-';
    }
}
