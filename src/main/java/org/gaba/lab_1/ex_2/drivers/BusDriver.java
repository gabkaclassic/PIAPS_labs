package org.gaba.lab_1.ex_2.drivers;

import org.gaba.lab_1.ex_1.Singleton;

import java.util.Random;

public final class BusDriver implements Driver {

    private static volatile BusDriver instance;
    private static final Random rand = new Random();

    private final int number;

    private BusDriver() {
        number = rand.nextInt();
    }

    public static BusDriver getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new BusDriver();
                }
            }
        }

        return instance;
    }
    @Override
    public void drive() {
        System.out.println("I am bus driver #" + number);
    }
}
