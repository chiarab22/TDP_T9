package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplENG implements Traducción{
    double distancia;
    double tiempo;
    double velocidad;
    @Override
    public void introducirDistancia(Scanner teclado) {
        
        System.out.println("Enter the travelled distance (km).");
        distancia = teclado.nextDouble();
        distancia = Math.round(distancia*1000)/1000;
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Enter the time of the trip (min).");
        tiempo = teclado.nextDouble();
        tiempo = Math.round(tiempo*1000)/1000;
    }

    @Override
    public void inicioRespuesta() {
        final int CST = 60;
        velocidad = distancia/(tiempo/CST);
        velocidad = Math.round(velocidad*1000)/1000;
    }

    @Override
    public void finRespuesta() {
        System.out.println(String.format("You have travelled at a speed of %f km/h.", velocidad));
    }
    
}
