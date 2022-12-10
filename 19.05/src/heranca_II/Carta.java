package heranca_II;

public class Carta extends Jogo {
    private int qtdeCartas;

    public Carta() {
        super();
    }

    public Carta(int qtdeCartas) {
        super();
        setQtdeCartas(qtdeCartas);
    }

    public int getQtdeCartas() {
        return qtdeCartas;
    }

    public void setQtdeCartas(int qtdeCartas) {
        this.qtdeCartas = qtdeCartas;
    }

    @Override
    public void MostrarJogo() {
        System.out.println("---------------------------");
        super.MostrarJogo();
        System.out.println("Cartas: " + getQtdeCartas());
        System.out.println("---------------------------");
    }
}