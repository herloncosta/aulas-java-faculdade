package polimorfismo;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate birthDate;
    private String cpf;

    public Employee(String name, LocalDate birthDate, String cpf) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = FormatterCPF.format(cpf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
