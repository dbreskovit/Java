public class Livro {

    String titulo, autor, editora, situacao;
    double preco;
    int ano;

    public void mostraLivro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Preço:" + preco);
        System.out.println("Situação: " + situacao);
    }

    public String mostraTitulo() {
        return titulo;
    }

    public String mostraAutor() {
        return autor;
    }

    public int mostraAno() {
        return ano;
    }

    public String mostraEditora() {
        return editora;
    }

    public Double mostraPreco() {
        return preco;
    }

    public String mostraSituacao() {
        return situacao;
    }

    public void alteraTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

    public void alteraAutor(String novoAutor) {
        autor = novoAutor;
    }

    public void alteraAno(int novoAno) {
        ano = novoAno;
    }

    public void alteraEditora(String novoEditora) {
        editora = novoEditora;
    }

    public void alteraPreco(double novoPreco) {
        preco = novoPreco;
    }

    public void alteraSituacao(String novaSituacao) {
        situacao = novaSituacao;
    }

    //Construtores
    public Livro (){}
    public Livro (int novoAno){}
    public Livro (double novoPreco){}
}