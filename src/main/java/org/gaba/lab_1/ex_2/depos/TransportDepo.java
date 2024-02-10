package org.gaba.lab_1.ex_2.depos;

import org.gaba.lab_1.ex_2.drivers.Driver;
import org.gaba.lab_1.ex_2.passengers.Passenger;

import java.util.List;

public interface TransportDepo {

    void addPassenger();

    List<Passenger> getPassengers();

    Driver getDriver();
}
