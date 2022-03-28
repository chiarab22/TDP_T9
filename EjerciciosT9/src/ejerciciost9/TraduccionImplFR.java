package ejerciciost9;

import java.util.Scanner;

public class TraduccionImplFR implements Traduccion{
    private  double distancia;
    private  double tiempo;
    private  double velocidad;
    
    @Override
    public void introducirDistancia(Scanner teclado) {
        System.out.println("Introduisez la distance parcourue (km).");
        distancia = teclado.nextDouble();
    }

    @Override
    public void introducirTiempo(Scanner teclado) {
        System.out.println("Introduisez le temps du parcours (min).");
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
        System.out.println("Vous vous êtes déplacés à une vitesse de " + velocidad + " km/h.");
    }
    
}
