package ejerciciost9.ejercicio2;

import ejerciciost9.ejercicio2.Traduccion;

import java.util.Scanner;

public class TraduccionImplENG implements Traduccion {
    private double distancia;
    private double tiempo;
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
        velocidad = Math.round(velocidad*100.0)/100.0;
    }

    @Override
    public void finRespuesta() {
        System.out.println("You have travelled at a speed of " + velocidad + " km/h.");
    }
    
}
