package liskov;

public class Animal {
    private String name, sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " makes " + sound);
    }
}
