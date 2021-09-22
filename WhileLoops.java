package com.company;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

//        while (true) {
//            if (!userInput.equalsIgnoreCase("exit")) {
//                System.out.println("welcome, please type 'exit' to exit this loop");
//            userInput = scanner.nextLine();
//            continue;}
//         else if (userInput.equalsIgnoreCase("exit")) {
//                System.out.println("you are out of the loop");
//                break;
//            }
//            System.out.println("hello");
//        }
        do {
            System.out.println("welcome, please type 'exit' to leave");
            userInput = scanner.nextLine();
        } while(!userInput.equalsIgnoreCase("exit"));





    }
}
