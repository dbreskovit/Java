/*
Faça um programa receba os valores da base e altura de um triângulo em 
seguida calcule e mostre a sua área. Sabe-se que: Área = (base *altura) / 2.
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv03 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();
        colorConsole color = new colorConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            color.violet();
            System.out.print("Informe a base e altura do triângulo:");
            color.cyan();
            System.out.print("[b]-> "); Float Base = read.nextFloat();
            System.out.print("[h]-> "); Float Height = read.nextFloat();

            Float Area = (Height * Base) / 2;

            clear.cls();

            color.violet();
            System.out.printf("Área do triângulo: %.2f", Area);

            color.white();

            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }
}