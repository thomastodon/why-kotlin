package com.example.whykotlin.java.nullability;

import org.junit.Test;

public class LibrarianTest {

    @Test
    public void name() {
        Librarian librarian = new Librarian();

        Book book = new Book(null, 123);

        librarian.getTitleLengthOfBook(book);
    }
}