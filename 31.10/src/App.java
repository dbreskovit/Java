
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class App {

    public static LinkedList<Cliente> clientes = new LinkedList<>();
    public static LinkedList<Produto> produtos = new LinkedList<>();

    public static void main(String[] args) {

        clientes.add(new Cliente(1, "Miguel", "Santo Augusto", "289.136.880-00"));
        clientes.add(new Cliente(2, "Davi", "Santo Augusto", "470.001.000-28"));
        clientes.add(new Cliente(3, "Arthur", "Santo Augusto", "059.497.870-05"));
        clientes.add(new Cliente(4, "Pedro", "Santo Augusto", "929.455.630-10"));
        clientes.add(new Cliente(5, "Gabriel", "Santo Augusto", "764.721.860-30"));
        clientes.add(new Cliente(6, "Bernardo", "Santo Augusto", "609.040.170-60"));
        clientes.add(new Cliente(7, "Lucas", "Santo Augusto", "108.790.590-79"));
        clientes.add(new Cliente(8, "Matheus", "Santo Augusto", "023.201.920-77"));
        clientes.add(new Cliente(9, "Rafael", "Santo Augusto", "633.799.910-07"));
        clientes.add(new Cliente(10, "Heitor", "Santo Augusto", "687.190.360-78"));
        clientes.add(new Cliente(11, "Sophia", "Santo Augusto", "038.382.520-20"));
        clientes.add(new Cliente(12, "Alice", "Santo Augusto", "610.292.960-81"));
        clientes.add(new Cliente(13, "Julia", "Santo Augusto", "616.578.670-72"));
        clientes.add(new Cliente(14, "Isabella", "Santo Augusto", "719.291.550-50"));
        clientes.add(new Cliente(15, "Manuela", "Santo Augusto", "056.363.620-30"));
        clientes.add(new Cliente(16, "Laura", "Santo Augusto", "926.902.840-22"));
        clientes.add(new Cliente(17, "Luiza", "Santo Augusto", "035.323.930-50"));
        clientes.add(new Cliente(18, "Valentina", "Santo Augusto", "459.085.720-04"));
        clientes.add(new Cliente(19, "Giovanna", "Santo Augusto", "459.085.720-04"));
        clientes.add(new Cliente(20, "Maria Eduarda", "Santo Augusto", "002.287.250-70"));
        produtos.add(new Produto(1, "g", 5.92, "Benzodiazepínicos"));
        produtos.add(new Produto(2, "Mg", 68.22, "GHB"));
        produtos.add(new Produto(3, "g", 1.99, "Maconha"));
        produtos.add(new Produto(4, "g", 23.99, "Anfetamina"));
        produtos.add(new Produto(5, "g", 1.50, "Cigarro"));
        produtos.add(new Produto(6, "g", 120, "Cocaína"));
        produtos.add(new Produto(7, "g", 1082.49, "Meta Anfetamina"));
        produtos.add(new Produto(8, "g", 5.00, "Crack"));
        produtos.add(new Produto(9, "g", 5.00, "Heroína"));
        produtos.add(new Produto(10, "L", 25.00, "Álcool"));
        produtos.add(new Produto(11, "g", 30.00, "Ecstasy"));
        produtos.add(new Produto(12, "g", 5.89, "Esteróides"));
        produtos.add(new Produto(13, "g", 79.99, "LSD"));
        produtos.add(new Produto(14, "g", 5.99, "Cola"));
        produtos.add(new Produto(15, "Kg", 125.54, "Buprenorfina"));
        produtos.add(new Produto(16, "mL", 28.99, "Ketamina"));
        produtos.add(new Produto(17, "g", 518.93, "Barbitúrico"));
        produtos.add(new Produto(18, "g", 99.99, "Popers"));
        produtos.add(new Produto(19, "Mg", 153.00, "Anabolizantes"));
        produtos.add(new Produto(20, "g", 0.0, "Amor"));

        VendaProdutos tela = new VendaProdutos();
        tela.setVisible(true);

    }
}
