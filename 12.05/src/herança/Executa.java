package herança;

public class Executa {
    public static void main(String[] args) {
        Aluno a1;
        Professor p1, p2;
        a1 = new Aluno("Diego Breskovit", "047.270.070-70", "3129465203", "25/08", "Masculino", 2020302183, "Informática");
        p1 = new Professor("Cleitom José Richter", "938.219.300-63", "6937665012", "28/02", "Masculino", "Programação III", 12898.62);
        p2 = new Professor("Uianes Rockenbach Biondo", "029.080.660-76", "9471829901", "02/06", "Masculino", "Banco de Dados", 0);
        a1.NOTAS = new double[3];
        a1.NOTAS[0] = (double) 10;
        a1.NOTAS[1] = (double) 10;
        a1.NOTAS[2] = (double) 10;
        a1.mostraPessoa();
        p1.mostraPessoa();
        p2.mostraPessoa();
    }
}