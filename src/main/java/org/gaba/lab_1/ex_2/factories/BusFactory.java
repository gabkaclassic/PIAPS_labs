package org.gaba.lab_1.ex_2.factories;

import org.gaba.lab_1.ex_2.drivers.BusDriver;
import org.gaba.lab_1.ex_2.drivers.Driver;
import org.gaba.lab_1.ex_2.passengers.BusPassenger;
import org.gaba.lab_1.ex_2.passengers.Passenger;

public final class BusFactory implements TransportFactory {
    @Override
    public Driver createDriver() {
        return BusDriver.getInstance();
    }

    @Override
    public Passenger createPassenger() {
        return new BusPassenger();
    }
}
