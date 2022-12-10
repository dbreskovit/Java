/*
Faça um programa que leia o raio de um círculo, calcule e mostre a área 
dessa figura geométrica. Sabe-se que: Área = π * r2 {π = 3.1415}.
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv04 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();
        colorConsole color = new colorConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();
            
            color.violet();
            System.out.print("Informe o valor do raio do círculo:");
            color.cyan();
            System.out.print("[R]-> "); Float R = read.nextFloat();
            
            double A = Math.PI*Math.pow(R,2);

            color.violet();
            System.out.printf("Área do círculo: %.2f", A);

            color.white();

            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }

}