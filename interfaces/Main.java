package interfaces;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jhon Doe");
        System.out.println(pessoa.imprimirNome());

        pessoa.modificarNome("Jane Doe");
        System.out.println(pessoa.imprimirNome());
    }
}
