/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbreskovit.atividadeconta;

import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class Inicio {

    public static LinkedList<Conta> lista;

    public static void main(String[] args) {
        Conta c1 = new Conta("admin", "admin", "Diego B.", 1000);
        Conta c2 = new Conta("1234567890", "1234567890", "Cleitom R.", 10000);
        Conta c3 = new Conta("3141592653", "3141592653", "Uianes B.", -500);
        Conta c4 = new Conta("5437665852", "5437665852", "Jair Bolsonaro", 228677948);
        Conta c5 = new Conta("8237408237", "8237408237", "Luiz Inácio Lula", 7400000);

        lista = new LinkedList<Conta>();

        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);

        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}
