package ar.edu.ubp.das.app;

public class Tarifa {

    protected	String 	tipo;
    public 		double 	costo;

    public Tarifa(String tipo, double costo) {
        this.tipo  = tipo;
        this.costo = costo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public double getDescuento() {
        if(this.tipo.equals("NORMAL")) {
            return 0d;
        }
        else if(this.tipo.equals("NIÑOS")) {
            return 25.5d;
        }
        else if(this.tipo.equals("JUBILADOS")) {
            return 35d;
        }
        return 0d;
    }

    public double getCosto() {
        return this.costo - this.getDescuento();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tarifa && this.tipo.equals(Tarifa.class.cast(obj).getTipo());
    }

}
