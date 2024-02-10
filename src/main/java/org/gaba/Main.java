package org.gaba;

import org.gaba.lab_1.ex_1.Singleton;
import org.gaba.lab_1.ex_2.depos.BusDepo;
import org.gaba.lab_1.ex_2.depos.TaxiDepo;
//import org.gaba.lab_2.drivers.BusDriver;
//import org.gaba.lab_2.drivers.TaxiDriver;
//import org.gaba.lab_2.passengers.BusPassenger;
//import org.gaba.lab_2.passengers.TaxiPassenger;
//import org.gaba.lab_2.passengers.types.BusPassengerType;
//import org.gaba.lab_2.transport.Bus;
//import org.gaba.lab_2.transport.Taxi;

public class Main {
    public static void main(String[] args) {
        lab1();
//        lab2();
    }

//    private static void builders() {
//        var taxi = new Taxi();
//        taxi.start();
//
//        try {
//            taxi.addDriver(new BusDriver());
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        taxi.addDriver(new TaxiDriver());
//        for (int i = 0; i < 4; i++) {
//            var passengerBuilder = TaxiPassenger.builder();
//            if (i % 2 == 0) {
//                passengerBuilder.adult();
//            }
//            else {
//                passengerBuilder.child();
//            }
//            taxi.addPassenger(passengerBuilder.build());
//        }
//
//        try {
//            taxi.addDriver(new TaxiDriver());
//        }
//        catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            taxi.addPassenger(TaxiPassenger.builder().adult().build());
//        }
//        catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//        }
//        taxi.start();
//        System.out.println();
//
//        var bus = new Bus();
//        bus.start();
//        try {
//            bus.addDriver(new TaxiDriver());
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        bus.addDriver(new BusDriver());
//        for (int i = 0; i < 30; i++) {
//            var passengerBuilder = BusPassenger.builder();
//            if (i % 3 == 0) {
//                passengerBuilder.adult();
//            }
//            else if (i % 3 == 1) {
//                passengerBuilder.beneficiary();
//            }
//            else {
//                passengerBuilder.child();
//            }
//            bus.addPassenger(passengerBuilder.build());
//        }
//
//        try {
//            bus.addDriver(new BusDriver());
//        }
//        catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            bus.addPassenger(BusPassenger.builder().adult().build());
//        }
//        catch (IllegalStateException e) {
//            System.out.println(e.getMessage());
//        }
//        bus.start();
//    }
//    private static void lab2() {
//        builders();
//    }

    private static void lab1() {
        singletons();
        factories();

    }
    private static void singletons() {

//        var s0 = new Singleton();
        var s1 = Singleton.getInstance();
        var s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }

    private static void factories() {
        var busDepo = new BusDepo();
        var taxiDepo = new TaxiDepo();

        for (int i = 0; i < 30; i++) {
            busDepo.addPassenger();
        }
        busDepo.start();
        System.out.println();

        for (int i = 0; i < 4; i++) {
            taxiDepo.addPassenger();
        }
        taxiDepo.start();
        System.out.println();

        try {
            busDepo.addPassenger();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        try {
            taxiDepo.addPassenger();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}