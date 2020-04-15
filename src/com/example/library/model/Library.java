package com.example.library.model;

import com.example.library.app.Book;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book ();
        book1.setTitle("Potop");
        book1.setAuthor("Henryk Sienkiewicz");
        book1.setISBN(1234);

//        book1.showInfo();

        System.out.println("Tytuł: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("iSBN: " + book1.getISBN());

    }
}
