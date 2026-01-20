package de.seuhd.observer;
import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
    // TODO: Add fields.
        protected List<Observer> observers = new ArrayList<>();
    void attach(Observer observer) {
        // TODO: Implement attach method.

        observers.add(observer);
    }

    void detach(Observer observer) {
        // TODO: Implement detach method.
        observers.remove(observer);
    }

    protected void notifyObservers() {
        // TODO: Implement fireUpdate method.
        for (Observer o: observers) {
            o.update(this);
        }
    }
}
