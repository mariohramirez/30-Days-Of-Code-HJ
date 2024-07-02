package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        int number = 0;

        for (int i=0;i<a.length;i++){
            number = scanner.nextInt();
            a[i]=number;
        }

        int tmp = 0;

        int swaps = 0;

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swaps++;
                }
            }
        }

        System.out.println("Array is sorted "+swaps+" in 5 swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);

    }



}
