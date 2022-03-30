package ejerciciost9.ejercicio1;


public abstract class Vehiculos {
    protected String marca, modelo;
    protected int fechaDeCompra;


    public Vehiculos(String marca, String modelo, int fechaDeCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaDeCompra = fechaDeCompra;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getFechaDeCompra() {
        return this.fechaDeCompra;
    }

    public abstract void mostrar();
}