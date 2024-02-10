package org.gaba.lab_2.passengers.types;

public enum TaxiPassengerType implements PassengerType {
    ADULT(false),
    CHILD(true);

    private final boolean babyChairNeeded;

    TaxiPassengerType(boolean babyChairNeeded) {
        this.babyChairNeeded = babyChairNeeded;
    }

    public boolean isBabyChairNeeded() {
        return babyChairNeeded;
    }

    @Override
    public String toString() {
        return String.format("Taxi passenger type: [baby chair: %b, title: %s]", babyChairNeeded, name());
    }
}
