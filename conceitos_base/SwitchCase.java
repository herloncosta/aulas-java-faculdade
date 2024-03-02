package conceitos_base;

public class SwitchCase {

    public static void main(String[] args) {
        String language = "C";

        switch (language) {
            case "C":
                System.out.println("Paradigma estruturado!");
                break;

            case "Java":
                System.out.println("Paradigma orientado a objetos!");

            default:
                System.out.println("Entrada inválida!");
                break;
        }
    }
}
