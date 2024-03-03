package agrupamento_objetos.agrupamento;

public class Student {

    private String name, naturalness;

    public Student(String name, String naturalness) {
        this.name = name;
        this.naturalness = naturalness;
    }

    public String getName() {
        return name;
    }

    public String getNaturalness() {
        return naturalness;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.name, this.naturalness);
    }
}
