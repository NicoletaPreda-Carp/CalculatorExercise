package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Please choose the type of operation you want to do: add, subtract, multiply, divide. ");
        System.out.println("For exiting the program type <exit>");

	while (true) {
        System.out.print("Insert the command: ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("exit")) {
            System.out.println("Goodbye!");
            break;
        }
        calculator.readNumbers();

        switch (command) {
            case "add": calculator.addNumbers();
            break;
            case "substract": calculator.substractNumbers();
            break;
            case "multiply": calculator.multiplyNumbers();
            break;
            case "divide": calculator.divideNumber();
            }
        }
        System.out.println("Thank you for using <The simple Calculator>!");
    }
}
