/*
 Faça um programa que leia três notas e seus respectivos pesos, calcule e 
mostre a média ponderada {mp = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3)}
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv01 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();
        colorConsole color = new colorConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            color.violet();
            System.out.print("Informe a primeira nota e peso:");
            color.cyan();
            System.out.print("-> "); Float n1 = read.nextFloat();
            System.out.print("-> "); Float p1 = read.nextFloat();

            color.violet();
            System.out.print("Digite a segunda nota e peso:");
            color.cyan();
            System.out.print("-> "); Float n2 = read.nextFloat();
            System.out.print("-> "); Float p2 = read.nextFloat();

            color.violet();
            System.out.print("Digite a terceira nota e peso:");
            color.cyan();
            System.out.print("-> "); Float n3 = read.nextFloat();
            System.out.print("-> "); Float p3 = read.nextFloat();

            Float mp = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);

            color.violet();
            System.out.printf("Média pontedera: %.2f", mp);

            color.white();
            
            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }

}