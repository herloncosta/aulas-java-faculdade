import java.util.Random;

public class Pessoa {
    private String name;
    private Random rand;
    private int id;

    public Pessoa(String name) {
        this.name = name;
        rand = new Random();
        this.id = rand.nextInt();
    }

    @SuppressWarnings("unused")
    private void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Teste 1");
        Pessoa pessoa2 = new Pessoa("Teste 2");
        System.err.println("Nome: " + pessoa1.getName() + ", Código identificador: " + pessoa1.getId());
        System.err.println("Nome: " + pessoa2.getName() + ", Código identificador: " + pessoa2.getId());
    }
}
