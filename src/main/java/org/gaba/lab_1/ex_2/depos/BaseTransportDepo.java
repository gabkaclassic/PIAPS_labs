package org.gaba.lab_1.ex_2.depos;

import org.gaba.lab_1.ex_2.drivers.Driver;
import org.gaba.lab_1.ex_2.factories.TransportFactory;
import org.gaba.lab_1.ex_2.passengers.Passenger;

import java.util.ArrayList;
import java.util.List;

abstract public class BaseTransportDepo implements TransportDepo {

    protected List<Passenger> passengers;
    protected final Driver driver;

    protected final TransportFactory factory;
    protected BaseTransportDepo(TransportFactory factory) {
        this.factory = factory;
        driver = factory.createDriver();
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

    public void start() {
        driver.drive();
        passengers.forEach(Passenger::board);
    }
}
