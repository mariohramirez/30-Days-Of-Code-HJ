package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        Double meal_cost = scanner.nextDouble();

        Result.solve(meal_cost, tip_percent, tax_percent);

    }

}
