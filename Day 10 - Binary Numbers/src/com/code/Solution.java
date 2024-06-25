package com.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> binary = new ArrayList<>();

        int n = scanner.nextInt();
        int r = 0;

        while (n>0){
            r = n%2;
            binary.add(r);
            n = n/2;
        }

        int count = 0;
        int greater = 0;

        for(int i=binary.size()-1;i>=0;i--){
            if(binary.get(i)==1){
                count++;
                if(count>=greater){
                    greater=count;
                }
            }
            else{
                count = 0;
            }
        }

        System.out.println(greater);

    }

}
