package com.code;

public class MyBook extends Book{

    private int price;

    public MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Title: "+this.title
        +"\nAuthor: "+this.author
        +"\nPrice: "+this.price);
    }
}
