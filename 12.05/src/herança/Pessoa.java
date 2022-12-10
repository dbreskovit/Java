package herança;

public class Pessoa {
    private String NOME, CPF, RG, NASC, SEXO;

    public Pessoa(String nome, String cpf, String rg, String nasc, String sexo)
    {
        this.setNome(nome);
        this.setCPF(cpf);
        this.setRG(rg);
        this.setNasc(nasc);
        this.setsexo(sexo);
    }
    public void mostraPessoa() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("RG: " + getRG());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Nasc.: " + getNasc());
    }

    //Setters & Getters 
    public void setNome(String NOME) {this.NOME = NOME;}
    public void setCPF(String CPF) {this.CPF = CPF;}
    public void setRG(String RG) {this.RG = RG;}
    public void setNasc(String NASC) {this.NASC = NASC;}
    public void setsexo(String SEXO) {this.SEXO = SEXO;}
    public String getNome() {return NOME;}
    public String getCPF() {return CPF;}
    public String getRG() {return RG;}
    public String getNasc() {return NASC;}
    public String getSexo() {return SEXO;}
}