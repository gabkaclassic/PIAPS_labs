package org.gaba.lab_1.ex_2.passengers;

import java.util.Random;

public final class TaxiPassenger implements Passenger {

    private static final Random rand = new Random();

    private final int number;

    public TaxiPassenger() {
        number = rand.nextInt();
    }

    @Override
    public void board() {
        System.out.println("I am taxi passenger #" + number);
    }
}
