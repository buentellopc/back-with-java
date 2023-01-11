package org.example;

import java.util.Objects;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }


    @Override
    public boolean equals(Object o) {
        // If the variables are located in the same place, they're the same
        if (this == o) return true;

        // If comparedObject is not of type book, objects aren't the same;
        if (o == null || getClass() != o.getClass()) {
            System.out.println("not an instance of book");
            return false;
        }


        // Until this point references are not the same but object is of the same class, compare the contents
        Book book = (Book) o;
        return published == book.published && Objects.equals(name, book.name) && Objects.equals(content, book.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, content, published);
    }
}