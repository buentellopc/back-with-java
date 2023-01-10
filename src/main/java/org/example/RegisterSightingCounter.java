package org.example;

import java.util.HashMap;

public class RegisterSightingCounter {
    private HashMap<String, Integer> allSightings;

    public RegisterSightingCounter() {
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted) {
        // both options are covered: new or already in the hashmap
        int timesSighted = this.allSightings.getOrDefault(sighted, 0);
        timesSighted++;
        this.allSightings.put(sighted, timesSighted);
    }

    public int timesSighted(String sighted) {
        System.out.println(this.allSightings.get(sighted));
        return this.allSightings.getOrDefault(sighted, 0);
    }
}