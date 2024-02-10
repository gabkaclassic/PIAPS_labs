package org.gaba.lab_3.participants.classes;

import org.gaba.lab_3.participants.PassengerComponent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FlightClass implements PassengerComponent {
    private List<PassengerComponent> passengers = new ArrayList<>();

    @Override
    public void add(PassengerComponent component) {
        passengers.add(component);
    }

    @Override
    public void remove(PassengerComponent component) {
        passengers.remove(component);
    }

    @Override
    public void loadBaggage(double baggageWeight) {
        System.out.println("Removing economy class baggage: " + baggageWeight);

        for(var passenger: passengers.stream()
                .sorted(Comparator.comparingDouble(PassengerComponent::getBaggageWeight).reversed())
                .toList()
        ) {
            var baggageDifferent = Math.min(passenger.getBaggageWeight(), baggageWeight);
            passenger.loadBaggage(-baggageDifferent);
            baggageWeight -= baggageDifferent;
            if(baggageWeight <= 0)
                break;
        }
    }

    @Override
    public double getBaggageWeight() {
        double totalBaggageWeight = 0;
        for (PassengerComponent passenger : passengers) {
            totalBaggageWeight += passenger.getBaggageWeight();
        }
        return totalBaggageWeight;
    }

    public int getPassengersCount() {
        return passengers.size();
    }
}
