import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal {

    private List<Player> observers;

    public Horse() {
        animalType = "HORSE";
        observers = new ArrayList<Player>();
    }

    @Override
    void eat() {
        currentState.eating();
        notifyObservers();
    }

    public void subscribe(Player pl) {
        observers.add(pl);
    }

    public void unsubscribe(Player pl) {
        observers.remove(pl);
    }

    public void notifyObservers() {
        if (!observers.isEmpty()) {
            int observersCount = observers.size();
            for (int i = 0; i < observersCount; ++i)
                observers.get(i).update();
        }
    }

}
