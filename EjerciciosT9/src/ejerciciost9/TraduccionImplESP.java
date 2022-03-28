package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplESP implements Traduccion {
    private  double distancia;
    private double tiempo;
    private double velocidad;
    
    @Override
    public void introducirDistancia(Scanner teclado) {
        System.out.println("Introduzca la distancia recorrida (km).");
        distancia = teclado.nextDouble();
      
        
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Introduzca el tiempo del recorrido (min).");
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
        System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h.");

    }
    
}
