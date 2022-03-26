package ejerciciost9;

import java.time.LocalDate;

public class Segway extends Vehiculos{
    private double autonomia;
    public Segway(String marca, String modelo, LocalDate fechaDeCompra,double autonomia) {
        super(marca, modelo, fechaDeCompra);
        this.autonomia = autonomia;
    }

    

    public double getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    
}