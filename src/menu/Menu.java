/*
 Programa que pida un número entero por teclado y a continuación imprima en
 pantalla un menú de 4 opciones:

 1 - Imprimirlo 10 veces
 2 - Comprobar si es primo
 3 - Imprimir los 5 números anteriores y los 5 posteriores.
 4 - Imprimir el carácter correspondiente al cuadrado del número, en caso de
 existir y ser imprimible. (consideramos imprimibles entre el 32 y el 256 ambos
 inclusive).

 No se permitirá al usuario escoger una opción incorrecta.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Menu {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcion;
        int num;
        String x = "";
        System.out.println("Introduce un número entero");
        num = tec.nextInt();
        System.out.println("Escoja una opción correcta");

        System.out.println("1 - Imprimirlo 10 veces");
        System.out.println("2 - Comprobar si es primo");
        System.out.println("3 - Imprimir los 5 números anteriores y los 5 posteriores");
        System.out.println("4 - Imprimir el cuadrado del número");
        System.out.println("HOLA MUNDO");

        do {
            opcion = tec.nextInt();
        } while (opcion < 1 || opcion > 4);
        switch (opcion) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num);
                }
                break;
            case 2:
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        x = "no ";
                        break;
                    }
                }
                System.out.println("El número " + x + "es primo");
                break;
            case 3:
                System.out.println("· 5 números anteriores");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(num - i);
                }
                System.out.println("· 5 números posteriores");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(num + i);
                }
                break;
            case 4:
                int R = num * num;
                if (R >= 32 && R <= 256) {
                    System.out.println("El cuadrado es: " + R);
                } else {
                    System.out.println("El resultado no está comprendido entre 32 y 256");
                }
                break;
        }
    }
}
