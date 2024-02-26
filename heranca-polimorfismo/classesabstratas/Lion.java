package classesabstratas;

public class Lion extends Animal {

    @Override
    void emitSound() {
        System.out.println("Rooaaaar!!!");
    }

    public void animalType() {
        System.out.println("Wild animal!");
    }
}
