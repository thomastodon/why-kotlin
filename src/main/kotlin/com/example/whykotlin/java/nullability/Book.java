package com.example.whykotlin.java.nullability;

public class Book {

    private String title;
    private long isbn;

    public String getTitle() {
        return title;
    }

    public Book(String title, long isbn) {
        this.title = title;
        this.isbn = isbn;
    }
}
