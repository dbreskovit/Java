/**
*    ▬▬▬▬▬.◙.▬▬▬▬▬  
*        ▂▄▄▓▄▄▂  
*    ◢◤█▀▀████▄▄▄▄▄▄ ◢◤  
*    █▄ █ █▄ ███▀▀▀▀▀▀▀ ╬  
*    ◥ █████ ◤  
*        ══╩══╩═  
*        ╬═╬  
*        ╬═╬   "What is the use of so many codes? 
*        ╬═╬   If life is not programmed and the best things have no logic?"
*        ╬═╬    @author Diego Breskovit
*    💀/ ╬═╬
*    /▌  ╬═╬   
*    / \
*    
**/

public class Lampada {
    
    boolean estado = false;

    public void desliga() {
        estado = false;
    }

    public void liga() {
        estado = true;
    }

    public void mostrarEstado() {
        if (estado == true) {
            System.out.println("Lâmpada Ligada!");

        } else {
            System.out.println("Lâmpada Desligada!");
        }
    }
    
    //Construtores   
    public Lampada(boolean estado){}
    public Lampada(int idadeCleitom){}
    public Lampada(){}
    
}