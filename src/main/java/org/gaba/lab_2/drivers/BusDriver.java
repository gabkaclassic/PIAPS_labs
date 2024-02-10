package org.gaba.lab_2.drivers;

public class BusDriver extends AbstractDriver {

    public BusDriver() {
        super(DriverCategory.C);
    }

    @Override
    public void drive() {
        System.out.println("Bus driving: " + this);
    }
}
