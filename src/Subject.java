import java.util.ArrayList;
import java.util.List;
public class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(Object arg) {
        for(Observer o : observers) {
            o.update(arg);
        }
    }
}
