package org.gaba.lab_1.ex_2.factories;

import org.gaba.lab_1.ex_2.drivers.Driver;
import org.gaba.lab_1.ex_2.passengers.Passenger;

public interface TransportFactory {
    Driver createDriver();
    Passenger createPassenger();
}
