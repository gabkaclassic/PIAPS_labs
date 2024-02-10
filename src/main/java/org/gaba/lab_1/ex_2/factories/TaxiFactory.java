package org.gaba.lab_1.ex_2.factories;

import org.gaba.lab_1.ex_2.drivers.Driver;
import org.gaba.lab_1.ex_2.drivers.TaxiDriver;
import org.gaba.lab_1.ex_2.passengers.Passenger;
import org.gaba.lab_1.ex_2.passengers.TaxiPassenger;

public final class TaxiFactory implements TransportFactory {
    @Override
    public Driver createDriver() {
        return TaxiDriver.getInstance();
    }

    @Override
    public Passenger createPassenger() {
        return new TaxiPassenger();
    }
}
