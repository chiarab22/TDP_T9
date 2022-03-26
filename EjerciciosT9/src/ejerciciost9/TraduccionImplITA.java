package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplITA implements Traduccion{
    double distancia;
    double tiempo;
    double velocidad;
    @Override
    public void introducirDistancia(Scanner teclado) {
        System.out.println("Introduca la distanza percorsa (km).");
        distancia = teclado.nextDouble();
        distancia = Math.round(distancia*1000)/1000;
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Introduca il tempo del percorso (min).");
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
        System.out.println(String.format("Si è spostato a una velocità di %f km/h.", velocidad));
    }
    
}
