public class Sleeping implements AnimalState {

    Animal animal;

    public Sleeping(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eating() {
        animal.setState(animal.getEatingState());
        System.out.println(animal.getAnimalType() + " is now eating.");
    }

    @Override
    public void sleeping() {
        System.out.println(animal.getAnimalType() + " is already sleeping.");
    }

    @Override
    public void idle() {
        animal.setState(animal.getIdleState());
        System.out.println(animal.getAnimalType() + " is now idle.");
    }
}
