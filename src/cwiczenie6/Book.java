package cwiczenie6;

public class Book {
    String title;
    String author;
    int ISBN;

    Book (String title, String author, int ISBN){
        this (title, author);
        this.ISBN = ISBN;
    }

    Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    void showInfo(){
        System.out.println("Tytuł: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
    }
}
