package herança;

public class Aluno extends Pessoa {
    private int MATRICULA;
    private String CURSO;
    public double NOTAS[];

    public Aluno(String nome, String cpf, String rg, String nasc, String sexo, int matricula, String curso)
    {
        super(nome, cpf, rg, nasc, sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);
    }

    @Override
    public void mostraPessoa() {
        System.out.println("===============================");
        System.out.println("             ALUNO             ");
        System.out.println("===============================");
        super.mostraPessoa();
        System.out.println("Curso: " + getCurso());
        System.out.println("Matricula: " + getMatricula());
        System.out.printf("Media de Notas Prog.: %.1f\n", ((NOTAS[0] + NOTAS[1] + NOTAS[2])/3));
        System.out.println("===============================");
    }

    //Setters & Getters 
    public void setMatricula(int MATRICULA) {this.MATRICULA = MATRICULA;}
    public void setCurso(String CURSO) {this.CURSO = CURSO;}
    public int getMatricula() {return MATRICULA;}
    public String getCurso() {return CURSO;}

}
