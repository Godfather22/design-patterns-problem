public class Eating implements AnimalState {

    private Animal animal;

    public Eating(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eating() {
        System.out.println(animal.getAnimalType() + " is already eating!");
    }

    @Override
    public void sleeping() {
        animal.setState(animal.getSleepingState());
        System.out.println(animal.getAnimalType() + " is now sleeping.");
    }

    @Override
    public void idle() {
        animal.setState(animal.getIdleState());
        System.out.println(animal.getAnimalType() + " is now doing nothing.");
    }
}
