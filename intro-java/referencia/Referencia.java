package referencia;

public class Referencia {
    private Aluno a1, a2;

    public Referencia() {
        a1 = new Aluno("Carlos", 20);
        a2 = new Aluno("Ana", 23);
        System.out.println("O nome do aluno a1 é " + a1.getNome());
        System.out.println("O nome do aluno a2 é " + a2.getNome());
        a2 = a1;
        // a1 = a2;
        a2.setNome("Flávia");
        System.out.println("O nome do aluno a1 é " + a1.getNome());
        manipulaAluno(a1);
        System.out.println("O nome do aluno a1 é " + a1.getNome());
    }

    public void manipulaAluno(Aluno aluno) {
        aluno.setNome("Márcia");
    }

    public static void main(String args[]) {
        System.out.println("Fim da Execução");
    }

}