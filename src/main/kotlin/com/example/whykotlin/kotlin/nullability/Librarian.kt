package com.example.whykotlin.kotlin.nullability

class Librarian {

    fun getTitleLengthOfBook(book: Book) : Int {
        return book.title.length
    }
}