package com.example.library.app;

public class Book {
    private String title;
    private String author;
    private int ISBN;

    public Book(){

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

//    public void showInfo(){
//        System.out.println("Tytuł: " + this.title);
//        System.out.println("Autor: " + this.author);
//        System.out.println("ISBN: " + this.ISBN);
    }

