package org.gaba.lab_1.ex_2.passengers;

import java.util.Random;

public class BusPassenger implements Passenger {
    private static final Random rand = new Random();

    private final int number;

    public BusPassenger() {
        number = rand.nextInt();
    }

    @Override
    public void board() {
        System.out.println("I am bus passenger #" + number);
    }
}
