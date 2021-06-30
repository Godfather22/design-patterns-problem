public class Cow extends Animal {

    public Cow() {
        animalType = "COW";
    }

    @Override
    void eat() {
        currentState.eating();
    }

}
