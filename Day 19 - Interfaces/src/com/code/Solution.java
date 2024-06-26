package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();

        Calculator calculator = new Calculator();

        int sum = calculator.divisorSum(n);

        System.out.println(sum);

    }

}
