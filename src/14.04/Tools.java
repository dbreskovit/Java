import java.io.IOException;

public class Tools {
    public void loading() throws InterruptedException {
        System.out.println("──────────────────────────────────────");
        System.out.println("    Máquina de bilhetes de estacionamento");
        for (int i = 0; i < 38; i++) {
            System.out.print("─");
            Thread.sleep(50);
        }
    }

    public void cls() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println("Oooops!");
        }
    }

    public void readKey() {
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}