package org.gaba;


import org.gaba.lab_3.participants.airplaines.Airplane;
import org.gaba.lab_3.participants.passengers.Passenger;
import org.gaba.lab_4.EditorPanel;
import org.gaba.lab_5.*;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        lab3();
//        lab4();
        lab5();
    }

    private static void lab5() {
        var nonFormattedText = """
            bla  bla      bla bla
            haha    hahaha hahaha    
            
            
            
            test . text , ( blabla, haha ) .
            blabla - haha
            “hahaha” 
        """;
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
}