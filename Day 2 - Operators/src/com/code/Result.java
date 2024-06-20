package com.code;

public class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (tip_percent*meal_cost)/100;
        double tax = (tax_percent*meal_cost)/100;
        double total = meal_cost+tip+tax;
        long solution = (Math.round(total));
        System.out.println(solution);
    }

}
