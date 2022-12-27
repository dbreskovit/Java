package heranca_II;

public class Executa {
    public static void main(String[] args) {

        Videogame v = new Videogame("Xbox");
        v.setNomeJogo("Fallout 4");
        v.setCategoria("Ação");
        v.setFornecedor("Bethesda");
        v.setPreco(70);
        v.MostrarJogo();

        Tabuleiro t = new Tabuleiro(100);
        t.setNomeJogo("Quebra-cabeça");
        t.setCategoria("Estratégia");
        t.setFornecedor("Toyster");
        t.setPreco(70);
        t.MostrarJogo();

        Carta c = new Carta(63);
        c.setNomeJogo("Uno");
        c.setCategoria("Estratégia");
        c.setFornecedor("Copag");
        c.setPreco(70);
        c.MostrarJogo();
    }

}
