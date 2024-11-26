package org.example;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {

    /**
     * Генерирует первые n чисел Фибоначчи.
     *
     * @param n количество чисел Фибоначчи для генерации
     * @return список первых n чисел Фибоначчи
     * @throws IllegalArgumentException если n меньше 1
     */
    public List<Integer> generateFibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом (n >= 1)");
        }

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0); // Первое число Фибоначчи
        if (n == 1) {
            return fibonacciList; // Если нужно только одно число
        }

        fibonacciList.add(1); // Второе число Фибоначчи
        for (int i = 2; i < n; i++) {
            int nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }
        return fibonacciList;
    }
}