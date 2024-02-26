package heranca;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Roof Roof!!");
    }

    public static void main(String[] args) {
        Dog loki = new Dog();
        loki.name = "Loki";

        System.out.println("Dog's name is " + loki.name);
    }
}
