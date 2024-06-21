package com.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 0;
        int c = 1;
        ArrayList<Integer> numbers = new ArrayList<>();

        while(c<=n){
            number=scanner.nextInt();
            numbers.add(number);
            c++;
        }

        System.out.println();

        for(int i=numbers.size()-1; i>=0;i--){
            System.out.print(numbers.get(i)+" ");
        }
    }

}
