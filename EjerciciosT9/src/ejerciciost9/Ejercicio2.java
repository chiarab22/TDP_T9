package ejerciciost9;

import java.util.Scanner;

public class Ejercicio2 {
    private int opcion = 0;
    Scanner teclado = new Scanner(System.in);
    public void comunicar() {
        do {
            menu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    TraduccionImplESP T1 = new TraduccionImplESP();
                    T1.introducirDistancia(teclado); 
                    T1.introducirTiempo(teclado);
                    T1.inicioRespuesta();
                    T1.finRespuesta();
                    break;
                case 2:
                    TraduccionImplENG T2 = new TraduccionImplENG();
                    T2.introducirDistancia(teclado); 
                    T2.introducirTiempo(teclado);
                    T2.inicioRespuesta();
                    T2.finRespuesta();
                    break;
                case 3:
                    TraduccionImplFR T3 = new TraduccionImplFR();
                    T3.introducirDistancia(teclado); 
                    T3.introducirTiempo(teclado);
                    T3.inicioRespuesta();
                    T3.finRespuesta();
                    break;
                case 4:
                    TraduccionImplITA T4 = new TraduccionImplITA();
                    T4.introducirDistancia(teclado); 
                    T4.introducirTiempo(teclado);
                    T4.inicioRespuesta();
                    T4.finRespuesta();
                    break;
                default:
                    break;
            }
        } while (opcion !=5);
    }
    private void menu() {
        System.out.println("¿En qué idioma deseas comunicarte?");
        System.out.println("1 - Español");
        System.out.println("2 - Inglés");
        System.out.println("3 - Francés");
        System.out.println("4 - Italiano");
        System.out.println("5 - Salir");
    }
}
