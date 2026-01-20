package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    // TODO: implement concrete subject
    protected static int value;
    public void setValue (int value) {
        this.value = value;
        notifyObservers();
    }
}
