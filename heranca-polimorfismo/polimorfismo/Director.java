package polimorfismo;

import java.time.LocalDate;
import java.util.UUID;

public class Director extends Employee {
    public Director(String name, LocalDate birthDate, String cpf) {
        super(name, birthDate, cpf);
    }

    public String generateRegistration() {
        return "E-" + UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        Director d1 = new Director("Jhon", LocalDate.of(2000, 9, 23), "12345678989");
        String registration = d1.generateRegistration();

        System.out.println(d1.getCpf());
        System.out.println(registration);
    }
}