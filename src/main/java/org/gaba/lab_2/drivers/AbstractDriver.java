package org.gaba.lab_2.drivers;

abstract public class AbstractDriver implements Driver {
    protected final DriverCategory category;

    public DriverCategory getCategory() {
        return category;
    }

    protected AbstractDriver(DriverCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "category=" + category +
                '}';
    }
}
