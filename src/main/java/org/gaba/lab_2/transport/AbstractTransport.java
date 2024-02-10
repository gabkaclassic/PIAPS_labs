package org.gaba.lab_2.transport;

import org.gaba.lab_1.ex_2.passengers.Passenger;
import org.gaba.lab_2.drivers.Driver;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractTransport implements Transport {

    protected Driver driver;
    protected List<Passenger> passengers;

    public AbstractTransport() {
        passengers = new ArrayList<>();
    }

    @Override
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

}
