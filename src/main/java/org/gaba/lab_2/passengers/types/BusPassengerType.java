package org.gaba.lab_2.passengers.types;

public enum BusPassengerType implements PassengerType {

    ADULT(3),
    CHILD(2),
    BENEFICIARY(1);

    private final int cost;

    BusPassengerType(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Buss passenger type: [cost: %d, title: %s]", cost, name());
    }
}
