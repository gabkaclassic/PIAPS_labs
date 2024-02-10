package org.gaba.lab_1.ex_2.depos;

import org.gaba.lab_1.ex_2.factories.BusFactory;

public class BusDepo extends BaseTransportDepo {

    private static final int CAPACITY = 30;
    public BusDepo() {
        super(new BusFactory());
    }

    @Override
    public void addPassenger() {
        if(passengers.size() < CAPACITY) {
            passengers.add(factory.createPassenger());
        }
        else {
            throw new IllegalStateException("Capacity limit reached: " + CAPACITY);
        }
    }
}
