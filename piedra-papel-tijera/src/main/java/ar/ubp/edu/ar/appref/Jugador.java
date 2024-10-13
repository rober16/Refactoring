package ar.edu.ubp.das.appref;

public class Jugador {

    private int ganados;

    public void setGanados() {
        this.ganados ++;
    }

    public int getGanados() {
        return ganados;
    }

    public int getResultado() {
        return (int)(Math.random() * 3);
    }

 }

