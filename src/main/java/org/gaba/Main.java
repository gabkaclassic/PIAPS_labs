package org.gaba;


import org.gaba.lab_2.drivers.BusDriver;
import org.gaba.lab_2.drivers.TaxiDriver;
import org.gaba.lab_2.passengers.BusPassenger;
import org.gaba.lab_2.passengers.TaxiPassenger;
import org.gaba.lab_2.transport.Bus;
import org.gaba.lab_2.transport.Taxi;
import org.gaba.lab_3.participants.airplaines.Airplane;
import org.gaba.lab_3.participants.passengers.Passenger;
import org.gaba.lab_4.EditorPanel;
import org.gaba.lab_5.*;
import org.gaba.lab_6.Deanery;
import org.gaba.lab_6.Department;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        lab2();
//        lab3();
//        lab4();
//        lab5();
        lab6();
    }

    private static void lab6() {
        var deanery1 = new Deanery("Physics");
        var deanery2 = new Deanery("Math");
        var department1 = new Department("#1");
        var department2 = new Department("#2");

        deanery1.addObserver(department1);
        deanery1.addObserver(department2);
        deanery2.addObserver(department1);
        System.out.println();

        deanery1.setStatus(false);
        deanery2.setStatus(true);
        deanery1.notifyObservers();
        deanery2.notifyObservers();
        System.out.println();

        deanery1.setStatus(true);
        deanery2.setStatus(true);
        deanery1.notifyObservers();
        deanery2.notifyObservers();
        System.out.println();

        deanery1.setStatus(true);
        deanery2.setStatus(false);
        deanery1.notifyObservers();
        deanery2.notifyObservers();
        System.out.println();

        deanery1.setStatus(false);
        deanery2.setStatus(false);
        deanery1.notifyObservers();
        deanery2.notifyObservers();
    }

    private static void lab5() {
        var nonFormattedText = """
            bla  bla      bla bla
            haha    hahaha hahaha    
            
            
            
            test . text , ( blabla, haha ) .
            blabla - haha
            “hahaha” 
        """;
        System.out.println("NOT FORMATTED:");
        System.out.println(nonFormattedText);
        var formatter = new TextFormatter(
                new WhitespacesFormatter(),
                new QuotesFormatter(),
                new SymbolWhitespaceFormatter(),
                new DashesFormatter(),
                new TabularFormatter(),
                new NewLineFormatter()
        );
        var formattedText = formatter.format(nonFormattedText);
        System.out.println("FORMATTED:");
        System.out.println(formattedText);
    }

    private static void lab4() {
        JFrame frame = new JFrame("Simple Graphic Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        EditorPanel editorPanel = new EditorPanel();
        frame.add(editorPanel);

        frame.setVisible(true);
    }

    private static void lab3() {

        var maxWeight = 1800;
        var airplane = new Airplane(maxWeight);
        var rand = new Random();

        airplane.addPilot(new Passenger("Pilot 1", 0));
        airplane.addPilot(new Passenger("Pilot 2", 0));

        for (int i = 0; i < 6; i++) {
            airplane.addStewardess(new Passenger("Stewardess " + i, 0));
        }
        for (int i = 0; i < 10; i++) {
            airplane.addFirstClassPassenger(new Passenger("First class passenger " + i, rand.nextInt(5, 100)));
        }
        for (int i = 0; i < 20; i++) {
            airplane.addBusinessClassPassenger(new Passenger("Business class passenger " + i, rand.nextInt(5, 35)));
        }
        for (int i = 0; i < 150; i++) {
            airplane.addEconomyClassPassenger(new Passenger("Economy class passenger " + i, rand.nextInt(5, 20)));
        }


        try {
            airplane.addBusinessClassPassenger(new Passenger("Mary", 36));
//            airplane.addBusinessClassPassenger(new Passenger("Mary", 30));
//            airplane.addEconomyClassPassenger(new Passenger("Mary", 21));
//            airplane.addEconomyClassPassenger(new Passenger("Mary", 20));
//            airplane.addFirstClassPassenger(new Passenger("Mary", 20));
//            airplane.addPilot(new Passenger("Mary", 21));
//            airplane.addStewardess(new Passenger("Mary", 21));
        }
        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        airplane.loadBaggage();

        System.out.println("Total baggage weight: " + airplane.getTotalBaggageWeight() + " kg");

    }

    private static void lab2() {
            var taxi = new Taxi();
            taxi.start();

            try {
                taxi.addDriver(new BusDriver());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            taxi.addDriver(new TaxiDriver());
            for (int i = 0; i < 4; i++) {
                var passengerBuilder = TaxiPassenger.builder();
                if (i % 2 == 0) {
                    passengerBuilder.adult();
                }
                else {
                    passengerBuilder.child();
                }
                taxi.addPassenger(passengerBuilder.build());
            }

            try {
                taxi.addDriver(new TaxiDriver());
            }
            catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            try {
                taxi.addPassenger(TaxiPassenger.builder().adult().build());
            }
            catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            taxi.start();
            System.out.println();

            var bus = new Bus();
            bus.start();
            try {
                bus.addDriver(new TaxiDriver());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            bus.addDriver(new BusDriver());
            for (int i = 0; i < 30; i++) {
                var passengerBuilder = BusPassenger.builder();
                if (i % 3 == 0) {
                    passengerBuilder.adult();
                }
                else if (i % 3 == 1) {
                    passengerBuilder.beneficiary();
                }
                else {
                    passengerBuilder.child();
                }
                bus.addPassenger(passengerBuilder.build());
            }

            try {
                bus.addDriver(new BusDriver());
            }
            catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }

            try {
                bus.addPassenger(BusPassenger.builder().adult().build());
            }
            catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            bus.start();
    }
}