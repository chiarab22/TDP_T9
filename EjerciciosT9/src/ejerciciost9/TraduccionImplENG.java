package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplENG implements Traduccion{
    private double distancia;
    private int tiempo;
    private double velocidad;
    
    @Override
    public void introducirDistancia(Scanner teclado) {
        
        System.out.println("Enter the travelled distance (km).");
        distancia = teclado.nextDouble();
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Enter the time of the trip (min).");
        tiempo = teclado.nextInt();
    }

    @Override
    public void inicioRespuesta() {
        final int CST = 60;
        velocidad = distancia/(tiempo/CST);
        velocidad = Math.round(velocidad*10)/10;
    }

    @Override
    public void finRespuesta() {
        System.out.println(String.format("You have travelled at a speed of %f km/h.", velocidad));
    }
    
}
