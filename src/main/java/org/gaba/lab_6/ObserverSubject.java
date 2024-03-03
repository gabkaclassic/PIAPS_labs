package org.gaba.lab_6;

public interface ObserverSubject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
