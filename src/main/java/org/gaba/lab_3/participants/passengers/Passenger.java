package org.gaba.lab_3.participants.passengers;

import org.gaba.lab_3.participants.PassengerComponent;

public class Passenger implements PassengerComponent {
    private String name;
    private double baggageWeight;

    public Passenger(String name, double baggageWeight) {
        this.name = name;
        this.baggageWeight = baggageWeight;
    }

    @Override
    public void add(PassengerComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(PassengerComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadBaggage(double baggageWeight) {
        System.out.println("Removing " + this.name + " baggage: " + baggageWeight);
        this.baggageWeight += baggageWeight;
    }

    @Override
    public double getBaggageWeight() {
        return baggageWeight;
    }

    @Override
    public int getPassengersCount() {
        return 1;
    }

}
