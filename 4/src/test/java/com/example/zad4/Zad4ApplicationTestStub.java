package com.example.zad4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Zad4ApplicationTestStub {

    Zad4Application zad4Application;

    @BeforeEach
    public void setUp() {
        zad4Application = new Zad4Application();
    }


    @Test
    void doesPersonExists() {
        assertTrue(zad4Application.doesPersonExists(1L));
    }

    @Test
    void isPlayerDead() {
        assertFalse(zad4Application.isPersonDead());
    }

    @Test
    void testToString() {
        assertEquals(zad4Application.toString(), "Person{" +
                "name='" + null + '\'' +
                ", age=" + 0 +
                ", height=" + 0 +
                ", weight=" + 0 +
                ", number=" + 0 +
                '}');


    }
}