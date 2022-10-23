package com.example.zjazd2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;

    }

    @Test
    public void test1() {
        int result = Calculator.suma(2, 2);
        assertEquals(4, result);
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        int result = Calculator.odejmowanie(2, 2);
        assertEquals(0, result);
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        int result = Calculator.mnozenie(2, 2);
        assertEquals(4, result);
        System.out.println("Test3");
    }

    @Test
    public void test4() {
        String result = Calculator.dzielenie(2, 0);
        assertEquals("Nie dzielimy przez zero", result);
        System.out.println("Test4");
    }

    @Test
    public void test5() {
        assertThrows(ArithmeticException.class, () -> calculator.dziel1(10, 0));
        System.out.println("Test5");
    }

    @Test
    public void test6() {
        String result = Calculator.isTemperature(20);
        assertNotEquals("Temperatura jest ujemna.", result);
        System.out.println("Test6");
    }

    @Test
    public void test7() {
        String result = Calculator.isTemperature(-3);
        assertNotEquals("Temperatura jest dodatnia", result);
        System.out.println("Test7");
    }

    @Test
    public void test8() {
        String result = Calculator.isTemperature(20);
        assertEquals("Temperatura jest dodatnia.", result);
        System.out.println("Test8");
    }

    @Test
    public void test9() {
        String result = Calculator.isTemperature(-10);
        assertEquals("Temperatura jest ujemna.", result);
        System.out.println("Test9");
    }

    @Test
    public void test10() {
        String result = Calculator.dzielenie(4, 0);
        assertEquals("Nie dzielimy przez zero", result);
        System.out.println("Test10");
    }

}
