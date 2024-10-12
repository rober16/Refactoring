package ar.ubp.edu.ar.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {

    private static BufferedReader data;

    static {
        Consola.data = new BufferedReader(new InputStreamReader(System.in));
    }

    private Consola() {}

    public static String readLine() throws IOException {
        return Consola.data.readLine();
    }

    public static int readInt() {
        while(true) {
            try {
                return Integer.parseInt(Consola.readLine().trim());
            }
            catch(NumberFormatException ex) {
                System.out.println("El valor ingresado no es \"INTEGER\", vuelva a intentar");
            }
            catch(IOException ex) {
            }
        }
    }
}