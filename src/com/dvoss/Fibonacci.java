package com.dvoss;

/**
 * Created by Dan on 10/18/16.
 */
public class Fibonacci {

    static int fibR(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Choose a whole number.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibR(n - 1) + fibR(n - 2);
    }

    static int fibI(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Choose a whole number.");
        }
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            int z = x + y;
            x = y;
            y = z;
        }
        return x;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(fibR(8));
        System.out.println(fibI(8));
    }
}
