package com.company;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome, please input principal amount, rate and time respectively.");
        Float principalAmount = userInput.nextFloat();
        Float rate = userInput.nextFloat();
        Float time = userInput.nextFloat();
        Float simpleInterest = (principalAmount * rate * time)/100;
        System.out.println("Your simple interest is " + simpleInterest);










    }
}
