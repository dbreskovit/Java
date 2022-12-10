public class Lampada {
    
    // Variáveis
        private boolean estado;
  
    // Métodos
        public void desliga() {
            setEstado(false);
        }

        public void liga() {
            setEstado(true);
        }

        public void mostrarEstado() {
            if (isEstado() == true) {
                System.out.println("Lâmpada Ligada!");

            } else {
                System.out.println("Lâmpada Desligada!");
            }
        }

    // Setters e Getters
        public boolean isEstado() {
            return estado;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }
    
    
    //Construtores   
        public Lampada(boolean estado){
            setEstado(estado);
        }
        public Lampada(){
            setEstado(false);
        }
}