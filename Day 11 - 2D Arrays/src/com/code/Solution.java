package com.code;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        for (int i=0;i<6;i++){
            for (int j=0;j<6;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int start;
        int limit;
        int outerStart=0;
        int outerLimit=3;
        int innerCicles;
        int outerCicles=0;
        int plus;
        int greater =0;
        int done =0;
        while (outerCicles<4) {
            start =0;
            limit=3;
            innerCicles=0;
            while (innerCicles < 4) {
                plus=0;
                for (int i = outerStart; i < outerLimit; i++) {

                    for (int j = start; j < limit; j++) {
                        if ((i == outerStart+1 && j == start) || (i == outerStart+1 && j == limit - 1)) {

                        }
                        else {
                            plus = plus+matrix[i][j];
                        }
                    }
                }
                start++;
                limit++;
                innerCicles++;
                if (done==0){
                    greater=plus;
                }
                if (plus>=greater){
                    greater=plus;
                }
                done++;
            }

            outerStart++;
            outerLimit++;
            outerCicles++;
        }
        System.out.println(greater);
    }

}
