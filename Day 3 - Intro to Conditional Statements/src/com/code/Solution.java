package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int residuo = n%2;

        if(residuo!=0)
        {
            System.out.println("Weird");
        }
        else if(n>=2 && n<=5)
        {
            System.out.println("Not Weird");
        }
        else if(n>=6 && n<=20) {
            System.out.println("Weird");
        }
        else if(n>20) {
            System.out.println("Not Weird");
        }

        scanner.close();

    }
}
