package heranca_II;

public class Jogo {

       private String nomeJogo, Categoria, fornecedor;
       private float preco;

       public Jogo() {
              super();
       }

       public Jogo(String nomeJogo, String categoria, String fornecedor, float preco) {
              super();
              this.nomeJogo = nomeJogo;
              this.Categoria = categoria;
              this.fornecedor = fornecedor;
              this.preco = preco;

       }

       public String getNomeJogo() {
              return nomeJogo;
       }

       public void setNomeJogo(String nomeJogo) {
              this.nomeJogo = nomeJogo;
       }

       public String getCategoria() {
              return Categoria;
       }

       public void setCategoria(String Categoria) {
              this.Categoria = Categoria;
       }

       public String getFornecedor() {
              return fornecedor;
       }

       public void setFornecedor(String fornecedor) {
              this.fornecedor = fornecedor;
       }

       public float getPreco() {
              return preco;
       }

       public void setPreco(float preco) {
              this.preco = preco;
       }

       public void MostrarJogo() {
              System.out.println("Nome: " + getNomeJogo());
              System.out.println("Categoria: " + getCategoria());
              System.out.println("Fornecedor: " + getFornecedor());
              System.out.println("Preço: " + getPreco());
       }
}