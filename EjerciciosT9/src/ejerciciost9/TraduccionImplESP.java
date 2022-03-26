package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplESP implements Traduccion {
    double distancia;
    double tiempo;
    double velocidad;
    @Override
    public void introducirDistancia(Scanner teclado) {
        System.out.println("Introduzca la distancia recorrida (km).");
        distancia = teclado.nextDouble();
        distancia = Math.round(distancia*1000)/1000;
      
        
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Introduzca el tiempo del recorrido (min).");
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
        System.out.println(String.format("Se ha desplazado a una velocidad de %f km/h.", velocidad));

    }
    
}
