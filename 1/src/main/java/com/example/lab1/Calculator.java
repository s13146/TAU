package com.example.lab1;

import java.util.Scanner;

public class Calculator {
    private static Scanner scanner;

    public static int suma(int num1, int num2) {
        return num1 + num2;  //ta metoda zwraca sumę dwóch parametrów
    }

    public static int odejmowanie(int num1, int num2) {
        return num1 - num2;
    }

    public static int mnozenie(int num1, int num2) {
        return num1 * num2;  //ta metoda zwraca sumę dwóch parametrów
    }

    public static int dziel1(int num1, int num2) {
        return num1 / num2;
    }

    public static String dzielenie(int num1, int num2) {
        String result = "";
        if (num2 != 0) System.out.println("Dzielenie: " + (num1 / num2));
        else if (num2 == 0)
            System.out.println("Nie dzielimy przez zero");
        return result = "Nie dzielimy przez zero";

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SPRAWDZENIE TEMPERATURY");
        System.out.println("Podaj temperature");

        int temperatura = scanner.nextInt();


        isTemperature(temperatura);


        System.out.println("KALKULATOR");
        System.out.println("Podaj pierwsza liczbe");
        int num1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbe");
        int num2 = scanner.nextInt();
        System.out.println("Są dwie liczby: " + num1 + " i " + num2);

        int wynik_s = suma(num1, num2);
        System.out.println("Dodawnia: " + suma(num1, num2));
        int wynik_o = odejmowanie(num1, num2);
        System.out.println("Odjemowania: " + odejmowanie(num1, num2));
        int wynik_m = mnozenie(num1, num2);
        System.out.println("Mnozenie: " + mnozenie(num1, num2));
        dzielenie(num1, num2);

        if (num2 == 0)
            System.out.println("Nie dzielimy przez zero");
        else System.out.println("Dzielenie: " + dziel1(num1, num2));


    }


    public static String isTemperature(int temperatura) {
        String temp = "";
        if (temperatura > 0) {
            temp = "Temperatura jest dodatnia.";
            System.out.println(temp);
        } else {
            temp = "Temperatura jest ujemna.";
            System.out.println(temp);
        }
        return temp;

    }
}






