package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashMap<String, String> postalCodes = new HashMap<>();

        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        postalCodes.put("33720", "Tamepere");
        postalCodes.put("33014", "Tampere");

        System.out.println(postalCodes.get("90014"));


        // null reference if no key in hashmap
        System.out.println(postalCodes.get("80897"));

        System.out.println(postalCodes);



    }
}