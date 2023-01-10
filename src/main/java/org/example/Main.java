package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RegisterSightingCounter registerSightingCounter = new RegisterSightingCounter();

        // Create your set of plates to sight
        registerSightingCounter.addSighting("fooPlate");
        registerSightingCounter.addSighting("barPlate");

        System.out.println("Times sighted: " + registerSightingCounter.timesSighted("fooPlate"));

        System.out.println("--- Next, some error");
        System.out.println("Times sighted: " + registerSightingCounter.timesSighted("foofjsklde"));

    }
}