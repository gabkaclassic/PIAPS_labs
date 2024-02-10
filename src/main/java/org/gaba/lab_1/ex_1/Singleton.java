package org.gaba.lab_1.ex_1;

import java.util.Random;

public final class Singleton {

    private static volatile Singleton instance;
    private static final Random rand = new Random();
    private int field;

    private Singleton() {
        field = rand.nextInt();
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    @Override
    public String toString() {
        return String.format("Singleton: %d", field);
    }
}
