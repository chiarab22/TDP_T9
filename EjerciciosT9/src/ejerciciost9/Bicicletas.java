package ejerciciost9;

import java.time.LocalDate;

public class Bicicletas extends Vehiculos {
    private int velocidades;

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


}
