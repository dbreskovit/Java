public class Funcionario {

    String nome, cpf, cargo;
    double salarioBase;
    boolean insalubridade;
    int tempoServico;

    public String mostraNome() {
        return nome;
    }

    public String mostraCpf() {
        return cpf;
    }

    public String mostraCargo() {
        return cargo;
    }

    public boolean mostraInsalubridade() {
        return insalubridade;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void alteraCpf(String cpf) {
        this.cpf = cpf;
    }

    public void alteraCargo(String cargo) {
        this.cargo = cargo;
    }

    public void alteraInsalubridade(boolean insalubridade) {
        this.insalubridade = insalubridade;
    }

    public void alteraSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calculaFolhaPagamento(int AnosDeServico) {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Insalubridade: " + insalubridade);

        double salario, taxaAnosServico, taxaInsalubridade, taxaINSS, taxaFGTS;
        double i0 = 0.05;
        double i1 = 0.14;
        double i2 = 0.11;
        double i3 = 0.08;

        taxaAnosServico = salarioBase * (AnosDeServico * i0);
        taxaInsalubridade = 0;
        taxaINSS = salarioBase * i2;
        taxaFGTS = salarioBase * i3;

        if (insalubridade == true)
            taxaInsalubridade = salarioBase * i1;

        salario = salarioBase + taxaAnosServico + taxaInsalubridade - taxaINSS - taxaFGTS;
        System.out.println("Salário: " + salario);
    }

    //Construtores
    public Funcionario (String nome,double salarioBase){}
    public Funcionario (String nome, String cpf, String cargo){}
    public Funcionario (String nome, String cargo){}
    
}