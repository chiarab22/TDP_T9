package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplITA implements Traduccion{
   private double distancia;
   private double tiempo;
   private double velocidad;
   
    @Override
    public void introducirDistancia(Scanner teclado) {
        System.out.println("Introduca la distanza percorsa (km).");
        distancia = teclado.nextDouble();
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Introduca il tempo del percorso (min).");
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
        System.out.println("Si è spostato a una velocità di " + velocidad + " km/h.");
    }
    
}
