/*
 Faça um programa que leia o nome de um funcionário, seu salário e o 
percentual de aumento. A partir dessas informações calcule e mostre um 
relatório contendo: nome, salário inicial, percentual de aumento, valor do 
aumento e o novo salário
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv02 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();
        colorConsole color = new colorConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            color.violet();
            System.out.print("Informe Nome do funcionário, Salário e Percentual de Aumento:");
            color.cyan();
            System.out.print("[Nome]-> "); String Nome = read.nextLine();
            System.out.print("[R$]-> "); Float salarioAntigo = read.nextFloat();
            System.out.print("[%]-> "); Float Persentual = read.nextFloat();

            clear.cls();
            color.violet();
            System.out.print("+--------------------+");
            color.cyan();
            System.out.print("      Relatório");
            color.violet();
            System.out.print("+--------------------+");
            color.cyan();

            Float salarioNovo = (salarioAntigo * (1 + (Persentual / 100)));
            Float Aumento = salarioNovo - salarioAntigo;

            System.out.println("Nome: " + Nome);
            System.out.printf("Aumento: R$%.2f%n", Aumento);
            System.out.println("Percetual: " + Persentual + "%");
            System.out.printf("Salário[old]: R$ %.2f%n", salarioAntigo);
            System.out.printf("Salário[new]: R$ %.2f%n", salarioNovo);

            color.violet();
            System.out.print("+--------------------+");
            
            color.white();

            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }
}