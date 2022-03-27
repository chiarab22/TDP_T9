package ejerciciost9;

import java.time.LocalDate;

public class Segway extends Vehiculos{
    private int autonomia;
    private final double precio = 18.90;
    
    public Segway(String marca, String modelo, LocalDate fechaDeCompra,int autonomia) {
        super(marca, modelo, fechaDeCompra);
        this.autonomia = autonomia;
    }

    public double getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void mostrar() {
       System.out.println(String.format("Segways %s %s (%s años) %d de autonomía", getMarca(),getModelo(),getFechaDeCompra(),getAutonomia()));
        
    }
}