package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        System.out.println(library.getBookByPart("sensibility"));


    }
}