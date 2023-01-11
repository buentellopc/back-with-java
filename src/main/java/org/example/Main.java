package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Book("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
    }
}