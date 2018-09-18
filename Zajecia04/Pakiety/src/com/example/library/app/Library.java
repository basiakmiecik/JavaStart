package com.example.library.app;

import com.example.library.model.Book;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling", "1234567");
        book.showInfo();

        //book.author="nikt";
        book.setTitle("Potter Harry");
        book.showInfo();
    }
}
