package org.gaba.lab_3.participants;

public interface PassengerComponent {
    void add(PassengerComponent component);
    void remove(PassengerComponent component);
    void loadBaggage(double baggageWeight);
    double getBaggageWeight();

    int getPassengersCount();
}
