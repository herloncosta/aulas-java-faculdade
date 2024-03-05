package aprofundando_heranca_polimorfismo;

import java.util.UUID;

// Sob a perspectiva hierárquica entre classes, Aluno "é uma" Pessoa
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String nacionalidade, String naturalidade) {
        super(nome, nacionalidade, naturalidade);
        this.matricula = UUID.randomUUID().toString();
    }

    public String getMatricula() {
        return this.matricula;
    }
}
