package com.example.whykotlin.kotlin.nullability

import org.junit.Test

class LibrarianTest {

    @Test
    fun test() {

        val librarian = Librarian()

        val book = Book("moby dick", 123)

        librarian.getTitleLengthOfBook(book)
    }
}