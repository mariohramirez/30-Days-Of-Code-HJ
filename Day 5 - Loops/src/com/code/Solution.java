package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int resultado=0;

        for(int i=1; i<=10; i++){
            resultado = n*i;
            System.out.println(n+" x "+i+" = "+resultado);
        }

    }
}
