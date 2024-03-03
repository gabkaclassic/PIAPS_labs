package org.gaba.lab_6;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObserverSubject implements ObserverSubject {

    protected final List<Observer> observers;

    protected boolean status;

    public AbstractObserverSubject() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        var view = toString();
        for (Observer observer : observers) {
            observer.update(view, status);
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
