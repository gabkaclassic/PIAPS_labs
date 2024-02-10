package org.gaba.lab_2.passengers;

import org.gaba.lab_1.ex_2.passengers.Passenger;

import java.util.Random;

abstract public class PassengerAbstract implements Passenger {

    private static final Random random = new Random();
    protected int id;

    protected PassengerAbstract() {
        this.id = random.nextInt();
    }
}
