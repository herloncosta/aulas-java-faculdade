package classesabstratas;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Lion lion = new Lion();

        dog.emitSound();
        dog.sleep();

        cat.emitSound();
        cat.sleep();

        lion.emitSound();
        lion.sleep();
        lion.animalType();
    }
}
