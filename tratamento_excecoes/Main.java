package tratamento_excecoes;

public class Main {

    public static void main(String[] args) {
        ExcecaoExplicita vetor = new ExcecaoExplicita();
        int elemento = vetor.getElemento(2);

        System.out.println(elemento);
    }
}
