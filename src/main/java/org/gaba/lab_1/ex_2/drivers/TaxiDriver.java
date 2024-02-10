package org.gaba.lab_1.ex_2.drivers;


import org.gaba.lab_1.ex_1.Singleton;

import java.util.Random;

public final class TaxiDriver implements Driver {

    private static volatile TaxiDriver instance;
    private static final Random rand = new Random();

    private final int number;

    private TaxiDriver() {
        number = rand.nextInt();
    }

    public static TaxiDriver getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new TaxiDriver();
                }
            }
        }

        return instance;
    }
    @Override
    public void drive() {
        System.out.println("I am taxi driver #" + number);
    }
}
