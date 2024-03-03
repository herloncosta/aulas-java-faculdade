package liskov;

public class Main {
    public static void main(String[] args) {
        // O tipo é Animal, mas a instância é Dog
        Animal animal = new Dog("Jack", "Woof");
        animal.makeSound();
    }
}
