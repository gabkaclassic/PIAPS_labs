package org.gaba.lab_2.transport;

import org.gaba.lab_1.ex_2.passengers.Passenger;
import org.gaba.lab_2.drivers.Driver;
import org.gaba.lab_2.drivers.DriverCategory;

public class Bus extends AbstractTransport {

    private static final int CAPACITY = 30;
    private static final DriverCategory CATEGORY = DriverCategory.C;

    @Override
    public void start() {
        System.out.println("Taxi starting");
        System.out.println(driver);
        passengers.forEach(System.out::println);
    }

    @Override
    public Bus addPassenger(Passenger passenger) {
        if(passengers.size() < CAPACITY) {
            passengers.add(passenger);
            return this;
        }
        throw new IllegalStateException("Capacity limit reached: " + CAPACITY);
    }

    @Override
    public Bus addDriver(Driver driver) {
        if(this.driver == null && driver.getCategory().equals(CATEGORY)) {
            this.driver = driver;
            return this;
        }
        else if(this.driver != null)
            throw new IllegalStateException("Driver already exists");
        else
            throw new IllegalArgumentException(String.format("Required driver category: %s, found: %s", CATEGORY, driver.getCategory()));

    }
}
