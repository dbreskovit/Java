/*
Um banco concederá um crédito especial aos seus clientes, variável com o 
saldo médio no último ano. Faça um programa em Java que leia o saldo 
médio de um cliente e calcule o valor do crédito de acordo com a tabela 
abaixo. Mostre uma mensagem informando o saldo médio e o valor do 
crédito. (use estrutura if-else)
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class atv06 {

    public static void main(String[] args) {

        clearConsole clear = new clearConsole();
        colorConsole color = new colorConsole();

        try (Scanner read = new Scanner(System.in)) {

            clear.cls();

            color.violet();

            System.out.print("Informe o Saldo Médio:");
            color.cyan();
            System.out.print("-> "); float saldo = read.nextFloat();

            color.cyan();
            if (saldo > 200 && saldo <= 400)
                System.out.println("[+20%] Saldo Médio: R$" + (saldo * 1.2));

            else if (saldo > 400 && saldo <= 600)
                System.out.println("[+30%] Saldo Médio: R$" + (saldo * 1.3));

            else if (saldo > 600)
                System.out.println("[+40%] Saldo Médio: R$" + (saldo * 1.4));

            else
                System.out.println("Nenhum crédito");

            color.white();
            
            try {System.in.read();}
            catch (Exception e) {e.printStackTrace();}
        }
    }
}