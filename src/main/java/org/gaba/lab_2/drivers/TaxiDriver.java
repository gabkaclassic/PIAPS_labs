package org.gaba.lab_2.drivers;

public class TaxiDriver extends AbstractDriver {

    public TaxiDriver() {
        super(DriverCategory.B);
    }

    @Override
    public void drive() {
        System.out.println("Taxi driving: " + this);
    }
}
