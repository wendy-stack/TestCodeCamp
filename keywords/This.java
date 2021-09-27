package com.keywords;

public class This {
    String name = "Delta";
    String username;

    public This (){
    this("Delta", "Adeyi");
    }

    public This (String name, String username){
        System.out.println("Attempting the task");
    }

    public static void main(String[] args) {
        This name = new This();

    }

}
