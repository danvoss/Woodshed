package com.dvoss;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dan on 10/18/16.
 */
public class Fibonacci {

    private static int fibR(int n) throws Exception {
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

    private static int fibI(int n) throws Exception {
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

    /**
     *   www.javacodegeeks.com/2014/02/dynamic-programming-introduction.html
     */

    private static int fibDynamic(int n) {
        if (n < 3) return 1;
        Map<Integer, Integer> vals = new HashMap<Integer, Integer>();
        vals.put(1, 1);
        vals.put(2, 1);
        return fibDynamic(n, vals);
    }

    private static int fibDynamic(int n, Map<Integer, Integer> vals) {
        if (vals.containsKey(n)) return vals.get(n);
        vals.put(n-1, fibDynamic(n-1, vals));
        vals.put(n-2, fibDynamic(n-2, vals));
        int newVal = vals.get(n-1) + vals.get(n-2);
        vals.put(n, newVal);
        return newVal;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(fibR(8));
        System.out.println(fibI(8));
        System.out.println(fibDynamic(8));
    }
}
