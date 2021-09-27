package com.introToOop;

import com.company.JavaMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        try {
            System.out.println("What is your age?");
            Scanner input = new Scanner(System.in);
            int yourAge = input.nextInt();
            System.out.println("Your age is " + yourAge);


        } catch (InputMismatchException wrongInput){
            System.out.println("This input is invalid");
        System.out.println("Please enter a digit");}
        
    }
}
