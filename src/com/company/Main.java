package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

	while (true) {
        System.out.println("Please choose the type of operation you want to do: add, subtract, multiply, divide. " +
                        "For exiting the program type <exit>");
        System.out.print("Insert the command: ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("exit")) {
            System.out.println("Goodbye!");
            break;
        }
        calculator.readNumbers();
        if (command.equalsIgnoreCase("add")) {
            calculator.addNumbers();
        } else if (command.equalsIgnoreCase("subtract")) {
            calculator.substractNumbers();
        } else if (command.equalsIgnoreCase("multiply")) {
            calculator.multiplyNumbers();
        } else if (command.equalsIgnoreCase("divide")) {
            calculator.divideNumber();
        }
    }
	System.out.println("Thank you for using <The simple Calculator>!");
    }
}
