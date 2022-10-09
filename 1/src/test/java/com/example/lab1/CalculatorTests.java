package com.example.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {
    private Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator= new Calculator();
        System.out.println("Befor");
    }
    @AfterEach
    public void earDown(){
        calculator=null;
        System.out.println("After");

    }
    @Test
    public void test1() {
      //  int choice = calculator.Calculator();
      //  assertEquals();
        System.out.println("Test1");
    }

}
