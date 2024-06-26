package com.code;

public class Calculator {

    public int power(int n, int p) throws Exception {
        if (p < 0 || n<0) {
            throw new Exception("n and p should be non-negative");
        }
        if (p == 0) {
            return 1;
        } else {
            int result = n;
            for (int i = 1; i < p; i++) {
                result = result * n;
            }
            return result;
        }
    }

}
