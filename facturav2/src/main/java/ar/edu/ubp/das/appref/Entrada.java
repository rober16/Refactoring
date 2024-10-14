package ar.edu.ubp.das.appref;

public class Entrada {

    private Tarifa tarifa;
    private int horaDesde;
    private int	horaHasta;
    private double costo;

    public Tarifa getTarifa() {
        return tarifa;
    }
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    public int getHoraDesde() {
        return horaDesde;
    }
    public void setHoraDesde(int horaDesde) {
        this.horaDesde = horaDesde;
    }
    public int getHoraHasta() {
        return horaHasta;
    }
    public void setHoraHasta(int horaHasta) {
        this.horaHasta = horaHasta;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public Entrada(Tarifa tarifa, int horaDesde, int horaHasta, double costo) {
        this.tarifa = tarifa;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.costo = costo;
    }

}