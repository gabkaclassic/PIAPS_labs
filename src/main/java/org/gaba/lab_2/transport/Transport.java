package org.gaba.lab_2.transport;

import org.gaba.lab_1.ex_2.passengers.Passenger;
import org.gaba.lab_2.drivers.Driver;

import java.util.List;

public interface Transport {

    void start();

    Transport addPassenger(Passenger passenger);

    Transport addDriver(Driver driver);

    List<Passenger> getPassengers();

    Driver getDriver();
}
