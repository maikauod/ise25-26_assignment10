package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    // TODO: Add fields and static variables.
    private static int counter = 1;
    private int currentValue;
    private final int id;
    private final Subject subject;

    public ConcreteObserver(Subject subject) {
        // TODO: Implement constructor.
        this.subject = subject;
        this.id = counter++;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // TODO: Implement update method.
        if (subject instanceof ConcreteSubject) {
            this.currentValue = ConcreteSubject.value;
            System.out.println("Observer " + this.id + " received update form subject: new value = " + this.currentValue);
        }

    }

    public void detach() {
        // TODO: Implement detach method.
        subject.detach(this);
    }
}
