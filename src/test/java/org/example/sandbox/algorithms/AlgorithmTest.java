package org.example.sandbox.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, Algorithm.fibonacci(0));
        assertEquals(1, Algorithm.fibonacci(1));
        assertEquals(1, Algorithm.fibonacci(2));
        assertEquals(2, Algorithm.fibonacci(3));
        assertEquals(3, Algorithm.fibonacci(4));
        assertEquals(5, Algorithm.fibonacci(5));
        assertEquals(8, Algorithm.fibonacci(6));
        assertEquals(55, Algorithm.fibonacci(10));
    }

    @Test
    public void testFibonacciRecursive() {
        assertEquals(0, Algorithm.fibonacciRecursive(0));
        assertEquals(1, Algorithm.fibonacciRecursive(1));
        assertEquals(1, Algorithm.fibonacciRecursive(2));
        assertEquals(2, Algorithm.fibonacciRecursive(3));
        assertEquals(3, Algorithm.fibonacciRecursive(4));
        assertEquals(5, Algorithm.fibonacciRecursive(5));
        assertEquals(8, Algorithm.fibonacciRecursive(6));
        assertEquals(55, Algorithm.fibonacciRecursive(10));
    }

    @Test
    public void testFibonacciLargeNumber() {
        assertEquals(12586269025L, Algorithm.fibonacciRecursive(50));
    }

    @Test
    public void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacciRecursive(-1));
    }
}