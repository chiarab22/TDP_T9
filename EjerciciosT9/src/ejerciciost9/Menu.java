package ejerciciost9;

import ejerciciost9.ejercicio1.Ejercicio1;
import ejerciciost9.ejercicio2.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    public void ejercicios() {
        int opcion = 0;

        do {
            try {
                menu();
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        Ejercicio1 ejercicio1 = new Ejercicio1();
                        ejercicio1.vistaCiclos();
                        break;
                    case 2:
                        Ejercicio2 ejercicio2 = new Ejercicio2();
                        ejercicio2.comunicar();
                        break;
                    case 3:
                        System.out.println("Gracias.");
                        break;
                    default:
                        System.out.println("Intente otra vez.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca una de las opciones señaladas.");
                teclado.nextLine();
            }
        } while (opcion != 3);

    }

    private void menu() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1 - Alquilar una bici");
        System.out.println("2 - Velocidad media versión plurilingüe");
        System.out.println("3 - Salir");
    }
}
