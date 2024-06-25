package com.code;

public abstract class Book {

    protected String title;
    protected String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    abstract void display();

}
