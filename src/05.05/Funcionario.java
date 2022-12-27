public class Funcionario {
    
    // Variáveis
        private String nome, cpf, cargo;
        private double salarioBase;
        private boolean insalubridade;

    // Métodos
        public String mostraNome() {
            return getNome();
        }

        public String mostraCpf() {
            return getCpf();
        }

        public String mostraCargo() {
            return getCargo();
        }

        public boolean mostraInsalubridade() {
            return isInsalubridade();
        }

        public void alteraNome(String nome) {
            setNome(nome);
        }

        public void alteraCpf(String cpf) {
            setCpf(cpf);
        }

        public void alteraCargo(String cargo) {
            setCargo(cargo);
        }

        public void alteraInsalubridade(boolean insalubridade) {
            setInsalubridade(insalubridade);
        }

        public void alteraSalarioBase(double salarioBase) {
            setSalarioBase(salarioBase);
        }

        public void calculaFolhaPagamento(int AnosDeServico) {
            System.out.println("Nome: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.println("Cargo: " + getCargo());
            System.out.println("Insalubridade: " + isInsalubridade());

            double salario, taxaAnosServico, taxaInsalubridade, taxaINSS, taxaFGTS;
            double i0 = 0.05;
            double i1 = 0.14;
            double i2 = 0.11;
            double i3 = 0.08;

            taxaAnosServico = getSalarioBase() * (AnosDeServico * i0);
            taxaInsalubridade = 0;
            taxaINSS = getSalarioBase() * i2;
            taxaFGTS = getSalarioBase() * i3;

            if (insalubridade == true)
                taxaInsalubridade = getSalarioBase() * i1;

            salario = getSalarioBase() + taxaAnosServico + taxaInsalubridade - taxaINSS - taxaFGTS;
            System.out.println("Salário: " + salario);
        }

    // Setters e Getters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public boolean isInsalubridade() {
            return insalubridade;
        }

        public void setInsalubridade(boolean insalubridade) {
            this.insalubridade = insalubridade;
        }

    //Construtores
        public Funcionario (String nome,double salarioBase){
            setNome(nome);
            setSalarioBase(salarioBase);
        }
        public Funcionario (String nome,double salarioBase, String cargo){
            setNome(nome);
            setSalarioBase(salarioBase);
            setCargo(cargo);
        }
        public Funcionario (String nome,double salarioBase, boolean insalubridade){
            setNome(nome);
            setSalarioBase(salarioBase);
            setInsalubridade(insalubridade);
        }
}