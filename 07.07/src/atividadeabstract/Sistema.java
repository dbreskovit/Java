/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeabstract;

/**
 *
 * @author Diego
 */
abstract class Sistema {
    String Dados;
    
    public void mostrar (InterfaceUsuario i){
        i.MostraDados("Dados:" + Dados);
    }
}
