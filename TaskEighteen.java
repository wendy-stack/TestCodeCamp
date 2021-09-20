package com.company;

public class TaskEighteen {
    public static void main(String[] args) {
        String str = "Democracy";
        char[] demoArray = str.toCharArray();
        System.out.println(demoArray[0]);
        String reversed = reverseString(str);

        String comeString = reversed.substring(4,8);
        System.out.println(comeString);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);

    }
}


