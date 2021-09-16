package com.company;

public class StringAndConcat {
    public static void main(String[] args) {
        // string and string concatenation
        String bird = "hummingbird";
        String adjective = " is beautiful.";
        String newString = bird + adjective;

        //System.out.println(newString);

        // string and primitive concatenation

        String movieName = "matrix: ";
        int parts = 2;
        boolean isReleased = false;
       // System.out.println("" + parts + isReleased);

        //.concat() method
        movieName.concat( parts + "");
        //System.out.println(movieName.concat( parts + ""));

        String MyName = "Wendy Adebolu ";
        int age = 25;
        //System.out.println(MyName + age);

        MyName.concat(age + "");
        System.out.println(MyName.concat(age + ""));


    }
}
