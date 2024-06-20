package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int numInt = scanner.nextInt()+i;
        double numDou = scanner.nextDouble()+d;
        scanner.nextLine();
        String message = s+scanner.nextLine();

        System.out.println(numInt);
        System.out.println(numDou);
        System.out.println(message);

    }

}
