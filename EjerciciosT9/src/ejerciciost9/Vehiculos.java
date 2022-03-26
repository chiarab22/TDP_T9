package ejerciciost9;

import java.time.LocalDate;

public abstract class Vehiculos {
    protected String marca, modelo;
    protected LocalDate fechaDeCompra;


    public Vehiculos(String marca, String modelo, LocalDate fechaDeCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaDeCompra = fechaDeCompra;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaDeCompra() {
        return this.fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
}