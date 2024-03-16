package tratamento_excecoes;

public class ExcecaoExplicita {
    int [] vetor = { 1, 2, 3, 4 };

    public int getElemento(int indice) {
        try {
            if (indice < 0  || indice > vetor.length) {
                throw new IllegalAccessException();
            }
        } catch (IllegalAccessException e) {
            System.out.printf("Erro: Índice  fora dos limites do vetor. %s\n", e.getMessage());
        }

        return vetor[indice];
    }
}
