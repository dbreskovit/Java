package herança;

public class Professor extends Pessoa {
    private String DISCIPLINA;
    private double SALARIO;

    public Professor(String nome, String cpf, String rg, String nasc, String sexo, String disciplina, double salario)
    {
        super(nome, cpf, rg, nasc, sexo);
        setDisciplina(disciplina);
        setSalario(salario);
    }

    @Override
    public void mostraPessoa() {
        System.out.println("===============================");
        System.out.println("           PROFESSOR           ");
        System.out.println("===============================");
        super.mostraPessoa();
        System.out.printf("Salário: R$%.2f\n", getSalario());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("===============================");
    }

    //Setters & Getters 
    public void setDisciplina(String DISCIPLINA) {this.DISCIPLINA = DISCIPLINA;}
    public void setSalario(Double SALARIO) {this.SALARIO = SALARIO;}
    public String getDisciplina() {return DISCIPLINA;}
    public Double getSalario() {return SALARIO;}
}