public abstract class Animal {

    protected String animalType;

    protected AnimalState eating;
    protected AnimalState sleeping;
    protected AnimalState idle;

    protected AnimalState currentState;

    public Animal() {
        eating = new Eating(this);
        sleeping = new Sleeping(this);
        idle = new Idle(this);

        currentState = idle;
    }

    void setState(AnimalState newState) {
        currentState = newState;
    }

    abstract void eat();

    void sleep() {
        currentState.sleeping();
    }

    void idle() {
        currentState.idle();
    }

    public AnimalState getEatingState() { return eating; }
    public AnimalState getSleepingState() { return sleeping; }
    public AnimalState getIdleState() { return idle; }

    String getAnimalType() {
        return animalType;
    }

}
