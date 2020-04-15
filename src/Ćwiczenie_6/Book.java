package Ćwiczenie_6;

public class Book {
    String title;
    String author;
    int ISBN;

    Book (String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void showInfo(){
        System.out.println("Tytuł: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
    }
}
