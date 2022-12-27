import java.util.Scanner;

public class Veiculo {

    private String placa;

    Veiculo() throws InterruptedException 
    {
        try (Scanner read = new Scanner(System.in)) {
            Tools tools = new Tools();
            tools.loading();
            System.out.print("\nPlaca do Veiculo: ");
            setPlaca(read.nextLine());
        }
    }

    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }

    public String getPlaca() {
        return this.placa;
    }

}