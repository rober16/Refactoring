package ar.edu.ubp.das.appref;

import java.util.HashMap;
import java.util.Map;

public class Tarifa {

    private	String tipo;
    private double costo;

    // Mapa estático para almacenar los descuentos por tipo de tarifa
    private static final Map<String, Double> descuentosPorTipo = new HashMap<>();

    // Inicialización de los descuentos
    static {
        descuentosPorTipo.put("NORMAL", 0d);
        descuentosPorTipo.put("NIÑOS", 25.5d);
        descuentosPorTipo.put("JUBILADOS", 35d);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return this.costo - this.getDescuento();
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Tarifa(String tipo, double costo) {
        this.tipo  = tipo;
        this.costo = costo;
    }    

    public double getDescuento() {
        // Devuelve el descuento correspondiente o 0 si no existe
        return descuentosPorTipo.getOrDefault(this.tipo, 0d);
    }    

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tarifa && this.tipo.equals(Tarifa.class.cast(obj).getTipo());
    }

}
