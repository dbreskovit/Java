/*
Escreva um programa Java capaz de mostrar na tela do computador os 
números inteiros PARES do intervalo[1,100]
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv07 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            System.out.println("+------------------------------+");
            System.out.println("   Intervalo N° pares [1-100]");
            System.out.println("+------------------------------+");

            int grid = 0;

            for (int i = 1; i <= 100; i++) {

                if (i % 2 == 0) {

                    if (i < 10) {
                        System.out.print("00" + i + " ");
                        grid = grid + 1;

                    } else if (i != 100) {
                        System.out.print("0" + i + " ");
                        grid = grid + 1;
                    } else {
                        System.out.print(i);
                    }
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