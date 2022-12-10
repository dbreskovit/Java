import java.util.Scanner;

public class Moeda {

    private double valor;
    private double troco;

    Moeda() 
    {
        try (Scanner read = new Scanner(System.in)) {
            Tools tools = new Tools();
            int op;
            do {
                tools.cls();
                System.out.println("──────────────────────────────────────");
                System.out.printf("          Dinheiro na máquina: R$ %.2f\n", getValor());
                System.out.println("──────────────────────────────────────");
                System.out.print("Insira uma moeda: ");
                AddMoeda(read.nextDouble());
                tools.readKey();
                tools.cls();
                System.out.println("──────────────────────────────────────");
                System.out.printf("          Dinheiro na máquina: R$ %.2f\n", getValor());
                System.out.println("──────────────────────────────────────");
                System.out.print("Adicionar outra moedas (1- Sim | 2- Não)? ");
                op = read.nextInt();
                tools.readKey();
            } while (op == 1);
            tools.cls();
            calcTroco(getValor());
            System.out.println("──────────────────────────────────────");
            System.out.printf("          Dinheiro na máquina: R$ %.2f\n", getValorf());
            System.out.printf("            Valor do troco: R$ %.2f\n", getTroco());
            System.out.println("──────────────────────────────────────");
            tools.readKey();
            tools.cls();
        }
    }

    public void AddMoeda(double moeda) {
        if (moeda != 0.05 && moeda != 0.10 && moeda != 0.25 && moeda != 0.50 && moeda != 1)
            System.out.println("Essa moeda não existe");
        else
            setValor(getValor() + moeda);
    }

    public void calcTroco(double valor) {
        setTroco(0.0);

        if (valor >= 2.0)
            setTroco(getValor() - 2.0);
        else if (valor > 1.5 && valor < 2.0)
            setTroco(getValor() - 1.5);
        else if (valor > 1.0 && valor < 1.5)
            setTroco(getValor() - 1.0);
        else if (valor > 0.5 && valor < 1.0)
            setTroco(getValor() - 0.5);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public Double getValor() {
        return this.valor;
    }

    public Double getTroco() {
        return this.troco;
    }

    public Double getValorf() {
        return getValor() - getTroco();
    }

}