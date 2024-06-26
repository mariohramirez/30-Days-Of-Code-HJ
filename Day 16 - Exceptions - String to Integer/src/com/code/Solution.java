package com.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        try {
            int number = Integer.parseInt(s);
            System.out.println(number);

        }
        catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }

}
