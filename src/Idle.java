public class Idle implements AnimalState {

    Animal animal;

    public Idle(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eating() {
        animal.setState(animal.getEatingState());
        System.out.println(animal.getAnimalType() + " is now eating.");
    }

    @Override
    public void sleeping() {
        animal.setState(animal.getSleepingState());
        System.out.println(animal.getAnimalType() + " is now sleeping.");
    }

    @Override
    public void idle() {
        System.out.println(animal.getAnimalType() + " is already idle.");
    }
}
