package com.example.lab1;


import java.util.Scanner;

public class Calculator {
    private static Scanner scanner;

    public int Dodawanie(int num1, int num2) {
        return num2 + num1;
    }

    public void odejmowanie() {
        //   output = operand1 - operand2;
    }

    public void mnozenie() {
        // output = operand1 * operand2;
    }

    public void dzielenie() {
        //   output = operand1 / operand2;
    }


    public static void main(String[] args) {

        scanner = new Scanner(System.in); //for the input from user
        System.out.println("Podaj swoj wiek:");
        int wiek = scanner.nextInt(); //take first number as an input
        //System.out.println("Enter the second number:");
        // int num2 = scanner.nextInt(); //take second number as an input

        //wynik= dodawanie(num1,num2);
        //int  wynik = Dodawanie(num1,num2);
        //  System.out.println(
        //         "wynik dodawania " + wynik
        //  );
        if (wiek<18) System.out.println("Nie jesteś pełnoletni ");
        else if (wiek >18 && wiek <21 ) System.out.println("Jesteś pełnoletni ale nie mozesz");
        else System.out.println("Jestes stary");
    }

}

//   System.out.println("Output result=" + output);



