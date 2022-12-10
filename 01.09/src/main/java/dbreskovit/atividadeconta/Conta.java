/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbreskovit.atividadeconta;

/**
 *
 * @author Diego
 */
public class Conta {
    private String conta;
    private String senha;
    private String correntista;
    private double saldo;

    public Conta(String conta, String senha, String correntista, double saldo) {
        this.conta = conta;
        this.senha = senha;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public boolean saque(double valor) {
        if (this.getSaldo() < valor) {
            return false;
        } else {
            setSaldo(getSaldo() - valor);
            return true;
        }
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            return true;
        } else {
            return false;
        }
    }

    public double verificaSaldo() {
        return getSaldo();
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
