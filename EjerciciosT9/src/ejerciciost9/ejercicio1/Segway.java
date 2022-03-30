package ejerciciost9.ejercicio1;


public class Segway extends Vehiculos {
    private int autonomia;
    private double precio = 18.90;

    public Segway(String marca, String modelo, int fechaDeCompra, int autonomia) {
        super(marca, modelo, fechaDeCompra);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public double getPrecio() {
        precio = Math.round(precio * 100.0) / 100.0;
        return this.precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Segways " + getMarca() + " " + getModelo() + "(" + getFechaDeCompra() + " años) " + getAutonomia() + " km de autonomía.  ----- " + getPrecio() + "€/hora");

    }
}