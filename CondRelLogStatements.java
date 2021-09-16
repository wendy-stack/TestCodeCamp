package com.company;

public class CondRelLogStatements {
    public static void main(String[] args) {
        //Conditional Statements
        int myAge = 30;
        int myScore = 15;

        if(myAge == 30 || myAge < 25) {
            System.out.println("It is equal for if");
        }
        else if(myAge >= 30) {
            System.out.println("It is equal for else if");
        }
        else {
            System.out.println("no valid comparison");
        }
        System.out.println("this is outside the condition");

    }
}
