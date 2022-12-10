public class Livro {

        // Variáveis
        private String titulo, autor, editora, situacao;
        private double preco;
        private int ano;

        // Métodos
        public void mostraLivro() {
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Autor: " + getAutor());
            System.out.println("Editora: " + getEditora());
            System.out.println("Preço:" + getPreco());
            System.out.println("Situação: " + getSituacao());
        }

        public String mostraTitulo() {
            return getTitulo();
        }

        public String mostraAutor() {
            return getAutor();
        }

        public int mostraAno() {
            return getAno();
        }

        public String mostraEditora() {
            return getEditora();
        }

        public Double mostraPreco() {
            return getPreco();
        }

        public String mostraSituacao() {
            return getSituacao();
        }

        public void alteraTitulo(String titulo) {
            setTitulo(titulo);
        }

        public void alteraAutor(String autor) {
            setAutor(autor);
        }

        public void alteraAno(int ano) {
            setAno(ano);
        }

        public void alteraEditora(String editora) {
            setEditora(editora);
        }

        public void alteraPreco(double preco) {
            setPreco(preco);
        }

        public void alteraSituacao(String situacao) {
           setSituacao(situacao);
        }

    // Setters e GettersQ
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }

        public String getSituacao() {
            return situacao;
        }

        public void setSituacao(String situacao) {
            this.situacao = situacao;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

    //Construtores
        public Livro (String titulo, String autor, String editora){
            setTitulo(titulo);
            setAutor(autor);
            setEditora(editora);
        }
        public Livro (String titulo, String autor, String editora, double preco){
            setTitulo(titulo);
            setAutor(autor);
            setEditora(editora);
            setPreco(preco);
        }
        public Livro (String titulo, String autor, String editora, String situacao){
            setTitulo(titulo);
            setAutor(autor);
            setEditora(editora);
            setSituacao(situacao);
        }
}