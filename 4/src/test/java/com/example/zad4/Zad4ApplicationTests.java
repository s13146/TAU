package com.example.zad4;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class Zad4ApplicationTests {

    @Mock
    Zad4Application zad4Application;

    @Test
    void testToString() {
        when(zad4Application.toString()).thenReturn("Person{" +
                "name='" + "name" + '\'' +
                ", age=" + 50 +
                ", height=" + 180 +
                ", wight=" + 90 +
                ", number=" + 20 +
                '}');
        assertEquals(zad4Application.toString(), "Person{" +
                "name='" + "name" + '\'' +
                ", age=" + 50 +
                ", height=" + 180 +
                ", wight=" + 90 +
                ", number=" + 20 +
                '}');
    }

    @Test
    void changeNumber() {
        zad4Application.setNumber(100);
        when(zad4Application.Number(20)).thenReturn(80);
        int number = zad4Application.Number(20);
        assertEquals(number, 80);
    }


    @Test
    void changeAddHeight() {
        zad4Application.setHeight(190);
        when(zad4Application.addHeight(60)).thenReturn(70);
        int age = zad4Application.addHeight(60);
        assertEquals(age, 70);
    }

    @Test
    void doesPersonExists() {
        zad4Application.setId(1L);
        when(zad4Application.doesPersonExists(1L)).thenReturn(true);
        assertTrue(zad4Application.doesPersonExists(1L));
    }

    @Test
    void shouldThrowError() {
        when(zad4Application.addHeight(+1)).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class, () -> zad4Application.addHeight(+1));
    }



}


