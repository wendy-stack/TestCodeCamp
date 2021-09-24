package com.company;

import java.util.Scanner;

public class JavaMethodsTask {
    public static void main(String[] args) {
        System.out.println("Welcome, please enter your training type");
        Scanner userInput = new Scanner(System.in);
        String trainingType = userInput.next();

       JavaMethodsTask.processTrainingType(trainingType);
    }

    public static void processTrainingType (String trainingType){
     String testifyTrainingType = "testify";
     if (trainingType.equals(testifyTrainingType)) {
         System.out.println("Welcome");
     } else {
         System.out.println("access denied");
        }
    }





}
