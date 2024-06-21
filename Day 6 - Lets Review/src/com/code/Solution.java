package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        scanner.nextLine();
        int i = 1;

        String even = "";

        String odd = "";

        while(i<=c) {
            String s = scanner.nextLine();
            for (int j=0;j<s.length();j++){
                even = even+s.charAt(j);
                j++;
                if(j>=s.length()){
                    break;
                }
                odd = odd + s.charAt(j);
            }
            System.out.println(even+" "+odd);
            even="";
            odd="";
            i++;
        }

        scanner.close();
    }

}
