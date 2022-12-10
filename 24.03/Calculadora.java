public class Calculadora {

    double a, b, result;

    public void LerA(double a) {
        this.a = a;
    }

    public void LerB(double b) {
        this.b = b;
    }

    public void somar() {
        result = a + b;
    }

    public void subtrair() {
        result = a - b;
    }

    public void multiplicar() {
        result = a * b;
    }

    public void dividir() {
        result = a / b;
    }

    public double mostrarResultado() {
        return result;
    }

    //Construtores
    public Calculadora (){}
    public Calculadora (double a){}
    public Calculadora (double a, double b){}
}