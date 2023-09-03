package ru.netology.dolgosheev.task_02;

import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Random random = new Random();

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt();
        int var2 = random.nextInt();
        int sumResult = calculator.addition(var1, var2);
        assertTrue(var1 + var2 == sumResult, "Неверное сложение " + var1 + " и " + var2);
    }

    @Test
    public void testSubstraction() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt();
        int var2 = random.nextInt();
        int subResult = calculator.substraction(var1, var2);
        assertTrue(var1 - var2 == subResult, "Неверное вычитание " + var1 + " и " + var2);

    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt();
        int var2 = random.nextInt();
        int subResult = calculator.divide(var1, var2);
        assertTrue(var1 / var2 == subResult, "Неверное деление " + var1 + " и " + var2);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt();
        int var2 = random.nextInt();
        int subResult = calculator.multiply(var1, var2);
        assertTrue(var1 * var2 == subResult, "Неверное умножение " + var1 + " и " + var2);
    }
}