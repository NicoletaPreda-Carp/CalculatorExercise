package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.introText();


	while (true) {
	    String command= calculator.readCommand();
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
