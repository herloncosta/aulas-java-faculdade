public class Calculadora {
    
    // Método de multiplicação usando ponto flutuante
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método de divisão usando ponto flutuante
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 1.0e+307;
        double num2 = 1.0e+100;

        // Multiplicação sem strictfp
        double resultadoSemStrictfp = calculadora.multiplicar(num1, num2);

        // Multiplicação com strictfp
        double resultadoComStrictfp = calculadora.multiplicar(num1, num2);

        System.out.println("Resultado da multiplicação sem strictfp: " + resultadoSemStrictfp);
        System.out.println("Resultado da multiplicação com strictfp: " + resultadoComStrictfp);
    }
}
