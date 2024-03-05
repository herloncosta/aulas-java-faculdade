package aprofundando_heranca_polimorfismo;

public class Pessoa {
    protected String nome, nacionalidade, naturalidade;

    public Pessoa(String nome, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String novoNome) {
        this.nome = novoNome;
    }

    protected String getNacionalidade() {
        return this.nacionalidade;
    }

    protected void setNacionalidade(String novaNacionalidade) {
        this.nacionalidade = novaNacionalidade;
    }

    protected String getNaturalidade() {
        return this.naturalidade;
    }

    protected void setNaturalidade(String novaNaturalidade) {
        this.nacionalidade = novaNaturalidade;
    }
}