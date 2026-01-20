package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    // TODO: implement concrete subject
    protected static int value;
    public void setValue (int value) {
        ConcreteSubject.value = value;
        System.out.println("value of subject updated to " + ConcreteSubject.value);
        notifyObservers();
    }
}
