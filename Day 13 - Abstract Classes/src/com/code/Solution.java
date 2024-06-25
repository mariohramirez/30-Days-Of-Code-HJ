package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();

        String author = scanner.nextLine();

        int price = scanner.nextInt();

        Book book = new MyBook(title, author, price);

        book.display();

    }

}
