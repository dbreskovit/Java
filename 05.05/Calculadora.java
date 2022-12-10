public class Calculadora {

    // Variáveis
        private double a, b, result;

    // Métodos
        public void LerA(double a) {
            setA(a);
        }

        public void LerB(double b) {
            setB(b);
        }

        public void somar() {
            setResult(a + b);
        }

        public void subtrair() {
            setResult(a - b);
        }

        public void multiplicar() {
            setResult(a * b);
        }

        public void dividir() {
            setResult(a / b);
        }

        public double mostrarResultado() {
            return getResult();
        }

    // Setters e Getters
        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getResult() {
            return result;
        }

        public void setResult(double result) {
            this.result = result;
        }

    // Construtores
        public Calculadora() {
            setA(0);
            setB(0);
            setResult(0);
        }

        public Calculadora(double a) {
            setA(a);
        }

        public Calculadora(double a, double b) {
            setA(a);
            setB(b);
        }
}