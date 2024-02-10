package org.gaba.lab_1.ex_2.depos;

import org.gaba.lab_1.ex_2.factories.TaxiFactory;

public class TaxiDepo extends BaseTransportDepo {

    private static final int CAPACITY = 4;

    public TaxiDepo() {
        super(new TaxiFactory());
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
