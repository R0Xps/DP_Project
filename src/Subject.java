import java.util.ArrayList;
import java.util.List;
public class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        if(observers.contains(o)) return;
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String arg) {
        for(Observer o : observers) {
            o.update(arg);
        }
    }
}
