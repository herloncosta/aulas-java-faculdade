package aprofundando_heranca_polimorfismo;

public class Main {
    public static void main(String[] args) {
        // A instância de Aluno pode ser do tipo Pessoa, por conta da hierarquia entre as classes
        // Pode-se dizer que, Aluno é um subtipo de Pessoa

        // Pessoa aluno = new Aluno("Herlon", "Brasileiro", "Simões Filho - Bahia");
        // System.out.println("Nome: " + aluno.getNome() + " Matrícula: " + aluno.getMatricula());

        // No código acima é gerado um erro, devido ao tipo Pessoa não possuir o método getMatricula()
        // que é um método particular da classe Aluno. Para resolução, pode ser utilizada a técnica de 
        // Type Cast ((tipo)objeto).metodo()

        Pessoa aluno = new Aluno("Herlon", "Brasileiro", "Simões Filho - Bahia");
        System.out.println("Nome: " + aluno.getNome() + " Matrícula: " + ((Aluno)aluno).getMatricula());
    }
}
