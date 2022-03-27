package ejerciciost9;

import java.time.LocalDate;

public class Bicicletas extends Vehiculos {
    private int velocidades;
    private final double precio = 4.90;

    public Bicicletas(String marca, String modelo, LocalDate fechaDeCompra, int velocidades) {
        super(marca, modelo, fechaDeCompra);
        this.velocidades = velocidades;
    }

    public int getVelocidades() {
        return this.velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void mostrar() {
        System.out.println(String.format("Bicis %s %s (%s años) %d velocidades", getMarca(),getModelo(),getFechaDeCompra(),getVelocidades()));
        
    }

}
