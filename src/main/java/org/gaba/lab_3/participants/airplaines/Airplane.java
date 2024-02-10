package org.gaba.lab_3.participants.airplaines;

import org.gaba.lab_3.participants.PassengerComponent;
import org.gaba.lab_3.participants.classes.FlightClass;

public class Airplane {

    private static final double MAX_ECONOMY_CLASS_BAGGAGE_WEIGHT = 20;
    private static final double MAX_BUSINESS_CLASS_BAGGAGE_WEIGHT = 35;
    private static final int ECONOMY_CAPACITY = 150;
    private static final int FIRST_CAPACITY = 10;
    private static final int BUSINESS_CAPACITY = 20;
    private PassengerComponent firstClass = new FlightClass();
    private PassengerComponent businessClass = new FlightClass();
    private PassengerComponent economyClass = new FlightClass();
    private PassengerComponent pilots = new FlightClass();
    private PassengerComponent stewardesses = new FlightClass();
    private double maxBaggageWeight;

    public Airplane(double maxBaggageWeight) {
        this.maxBaggageWeight = maxBaggageWeight;
    }

    public void addPilot(PassengerComponent pilot) {
        if (pilot.getBaggageWeight() != 0)
            throw new IllegalStateException("Pilot cannot have a baggage weight not of 0");
        pilots.add(pilot);
    }

    public void addStewardess(PassengerComponent stewardess) {
        if (stewardess.getBaggageWeight() != 0)
            throw new IllegalStateException("Stewardess cannot have a baggage weight not of 0");
        stewardesses.add(stewardess);
    }

    public void addFirstClassPassenger(PassengerComponent passenger) {
        if(firstClass.getPassengersCount() >= FIRST_CAPACITY)
            throw new IllegalStateException(String.format("First class cannot have more than %d passengers", FIRST_CAPACITY));
        firstClass.add(passenger);
    }

    public void addBusinessClassPassenger(PassengerComponent passenger) {
        if(passenger.getBaggageWeight() > MAX_BUSINESS_CLASS_BAGGAGE_WEIGHT)
            throw new IllegalStateException(String.format("Passenger of business class cannot have a baggage weight more than %f", MAX_BUSINESS_CLASS_BAGGAGE_WEIGHT));
        if(businessClass.getPassengersCount() >= BUSINESS_CAPACITY)
            throw new IllegalStateException(String.format("Business class cannot have more than %d passengers", BUSINESS_CAPACITY));
        businessClass.add(passenger);
    }

    public void addEconomyClassPassenger(PassengerComponent passenger) {
        if(passenger.getBaggageWeight() > MAX_ECONOMY_CLASS_BAGGAGE_WEIGHT)
            throw new IllegalStateException(String.format("Passenger of business class cannot have a baggage weight more than %f", MAX_ECONOMY_CLASS_BAGGAGE_WEIGHT));
        if(economyClass.getPassengersCount() >= ECONOMY_CAPACITY)
            throw new IllegalStateException(String.format("Economy class cannot have more than %d passengers", ECONOMY_CAPACITY));

        economyClass.add(passenger);
    }

    public void loadBaggage() {
        double totalBaggageWeight = firstClass.getBaggageWeight() +
                businessClass.getBaggageWeight() +
                economyClass.getBaggageWeight();
        if (totalBaggageWeight > maxBaggageWeight) {
            double excessBaggageWeight = totalBaggageWeight - maxBaggageWeight;
            economyClass.loadBaggage(excessBaggageWeight);
            System.out.println("Excess baggage removed from economy class passengers.");
        }
    }


    public double getTotalBaggageWeight() {
        return firstClass.getBaggageWeight() +
                businessClass.getBaggageWeight() +
                economyClass.getBaggageWeight();
    }
}
