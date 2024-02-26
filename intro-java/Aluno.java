// IMPLEMENTAÇÃO NORMAL DE UMA CLASSE
// [Modificador] class Identificador [TipoParâmetros] [Superclasse] [Superinterface] { [Corpo da Classe] }

// MODIFICADORES DE ACESSO
// {Annotation, public, protected, private, abstract, static, final, strictfp}.

import java.util.Random;

public class Aluno {
    private String name;
    private int age;
    private Random rand;
    protected double id;

    public Aluno(String name, int age) {
        rand = new Random();
        this.name = name;
        this.age = age;
        this.id = rand.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("ID: " + this.id);
    }

    public static void main(String args[]) {
        Aluno aluno = new Aluno("Herlon Costa", 27);
        aluno.printInfo();
    }
}