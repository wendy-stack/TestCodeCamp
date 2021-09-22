package com.company;

import java.util.Scanner;

public class Task21B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            if (!userInput.equalsIgnoreCase("Testify")) {
                System.out.println("Try again ");
                userInput = scanner.nextLine();
                continue;
            } else if (userInput.equalsIgnoreCase("Testify")) {
                userInput = scanner.nextLine();
                System.out.println("Testify");
                }

        }








    }
}
