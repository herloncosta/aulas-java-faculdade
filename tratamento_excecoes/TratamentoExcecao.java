package tratamento_excecoes;

public class TratamentoExcecao {
    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        // EXEMPLO 01
        // try {
        //     int resultado = dividir(0, 0);
        //     System.out.println(resultado);
        // } catch (ArithmeticException e) {
        //     System.out.printf("Erro: %s\n", e.getMessage());
        // } finally {
        //     System.out.println("Fim do tratamento de erro!");
        // }
        
        // EXEMPLO 02
        int quociente, dividendo = 10, divisor = 0;

        try {
            if (divisor == 0) {
                throw new ArithmeticException("Não é possível dividir um número por 0.");
            }
            quociente = dividir(dividendo, divisor);
            System.out.println(quociente);
        } catch (ArithmeticException e) {
            System.out.printf("Erro: %s\n", e.getMessage());
        }
    }
}
