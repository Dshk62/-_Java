package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciGeneratorTest {

    private final FibonacciGenerator generator = new FibonacciGenerator();

    @Test
    public void testGenerateFibonacci_ValidInput() {
        List<Integer> result = generator.generateFibonacci(5);
        assertEquals(List.of(0, 1, 1, 2, 3), result);
    }

    @Test
    public void testGenerateFibonacci_OneElement() {
        List<Integer> result = generator.generateFibonacci(1);
        assertEquals(List.of(0), result);
    }

    @Test
    public void testGenerateFibonacci_TwoElements() {
        List<Integer> result = generator.generateFibonacci(2);
        assertEquals(List.of(0, 1), result);
    }

    @Test
    public void testGenerateFibonacci_NegativeInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            generator.generateFibonacci(-1);
        });
        assertEquals("n должно быть натуральным числом (n >= 1)", thrown.getMessage());
    }

    @Test
    public void testGenerateFibonacci_ZeroInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            generator.generateFibonacci(0);
        });
        assertEquals("n должно быть натуральным числом (n >= 1)", thrown.getMessage());
    }
}