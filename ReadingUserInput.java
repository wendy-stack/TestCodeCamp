package com.company;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome, please input your date of birth.");
        short DOB = userInput.nextShort();
        short presentYear = 2021;
       int customersAge = presentYear - DOB;
        System.out.println("You are " + customersAge + " years old" );

        if (customersAge <18){
            System.out.println("Too young to bet, bye.");
        } else if (customersAge >=18){
            System.out.println("Welcome, you are qualified");
        }




    }
}
