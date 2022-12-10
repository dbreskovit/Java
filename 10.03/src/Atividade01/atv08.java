/*
Escreva um programa Java para imprimir na tela todos os números ímpares 
de 299 a 101 em ordem decrescente. 
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv08 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            System.out.println("+------------------------------+");
            System.out.println(" Intervalo N° ímpares [299-101]");
            System.out.println("+------------------------------+");

            int grid = 0;

            for (int i = 299; i >= 101; i--) {

                if (i % 2 != 0) {

                    System.out.print(i + " ");
                    grid = grid + 1;

                }

                if (grid % 8 == 0) {
                    System.out.printf("%n");
                }
            }

            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }

}