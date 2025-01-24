package org.example.sandbox.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {
    public static Map<Integer, Integer> map = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prev = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return memo(n - 1) + memo(n - 2);
    }
    private static int memo(int n) {
        if (n <= 1) {
            return n;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = memo(n - 1) + memo(n - 2);
        map.put(n, result);

        return result;
    }
    public static void main(String[] args) {//psvm
        //System.out.println(fibonacci(10)); // 55
        System.out.println(fibonacciRecursive(10)); // 55

        //for(int x = 0; x <= 10; x++) {
          //  System.out.println("Fibonacci("+ x + ") = " + fibonacci(x));
       // }
    }
}
/*
    recursive approach when trying to get to 50 takes a long time, and is 2^n in O time complexity,
    method is getting called multiple times for the same values. it's also recalculating the same values thousands of times
    -so algorithm is not efficient, at least with int
    -use comments sparingly, especially if code is getting changed in the future (in real life)
    -camelCase, whitespace, and indentation are important for this class
*/
