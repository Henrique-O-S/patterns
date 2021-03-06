import java.lang.reflect.Array;
import java.util.ArrayList;

abstract class Bar {
    private ArrayList<BarObserver> observers;

    public Bar () {
        observers = new ArrayList<BarObserver>();
    }

    public abstract boolean isHappyHour();

    public abstract void startHappyHour();

    public abstract void endHappyHour();

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
