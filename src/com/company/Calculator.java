package com.company;


import java.util.Scanner;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String command;

    public Calculator () {

    }

    public void introText () {
        System.out.println("Please choose the type of operation you want to do: add, subtract, multiply, divide. ");
        System.out.println("For exiting the program type <exit>");
    }

    public String readCommand () {
        System.out.print("Insert the command: ");
        Scanner scanner = new Scanner(System.in);
        this.command = scanner.nextLine();
        return command;
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the first number: ");
        this.firstNumber = scanner.nextInt();
        System.out.print("Insert the second number ");
        this.secondNumber = scanner.nextInt();
    }

    public void addNumbers () {
        int result = this.firstNumber + this.secondNumber;
        System.out.println("The result of the add is " + result);
    }

    public  void substractNumbers () {
        int result = this.firstNumber - this.secondNumber;
        System.out.println("The result of the substraction is " + result);
    }

    public void multiplyNumbers () {
        int result = this.firstNumber * this.secondNumber;
        System.out.println("The result of the multiply is " + result);
    }

    public void divideNumber () {
        double result = (double)    this.firstNumber / this.secondNumber;
        System.out.println("The result of the division is " + result);
    }
}
