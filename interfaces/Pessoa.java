package interfaces;

public class Pessoa implements InterfacePessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String imprimirNome() {
        return nome;
    }

    public void modificarNome(String novoNome) {
        if(!this.nome.isBlank()) {
            this.nome = novoNome;
        } else {
            System.out.println("O nome não pode ser vazio!");
        }
    }
}
