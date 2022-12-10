/*
Faça um programa que calcule o custo de um veículo novo ao consumidor, 
sabendo-se que o valor de um carro novo é composto pelo valor de fábrica 
somado à percentagem do distribuidor e dos impostos (aplicados ao custo de 
fábrica). Supondo que a percentagem do distribuidor seja de 28% e os 
impostos de 45%, escrever um programa em java que leia o modelo de um 
carro e o seu custo de fábrica – em seguida, calcule e mostre:
Modelo, Valor de Fábrica, Impostos, Valor distribuidor e Custo Final
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv05 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();
        colorConsole color = new colorConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            color.violet();
            System.out.print("Informe Modelo do veículo e valor de Fábrica:");
            color.cyan();
            System.out.print("[Modelo]-> "); String model = read.nextLine();
            System.out.print("[Valor]-> "); Float value = read.nextFloat();
            
            Double distributor = value * 0.28;
            Double tax = value * 0.45;
            Double cost = value + distributor + tax;

            clear.cls();
            
            color.violet();
            System.out.print("+----------------------------+");
            color.cyan();
            System.out.print("        Informações");
            color.violet();
            System.out.print("+----------------------------+");
            color.cyan();

            System.out.println("Modelo: " + model);
            System.out.printf("Fábrica: R$%.2f%n", value);
            System.out.printf("Distribuidor: R$%.2f%n", distributor);
            System.out.printf("Impostos: R$%.2f%n", tax);
            System.out.printf("Custo final: R$%.2f%n", cost);

            color.violet();
            System.out.print("+----------------------------+");
            
            color.white();

            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }

}