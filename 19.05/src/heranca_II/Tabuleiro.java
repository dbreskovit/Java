package heranca_II;

public class Tabuleiro extends Jogo {
    private int qtdePecas;

    public Tabuleiro() {
        super();
    }

    public Tabuleiro(int qtdePecas) {
        super();
        setQtdePecas(qtdePecas);
    }

    public int getQtdePecas() {
        return qtdePecas;
    }

    public void setQtdePecas(int qtdePecas) {
        this.qtdePecas = qtdePecas;
    }

    @Override
    public void MostrarJogo() {
        System.out.println("---------------------------");
        super.MostrarJogo();
        System.out.println("Peças: " + getQtdePecas());
        System.out.println("---------------------------");
    }
}
