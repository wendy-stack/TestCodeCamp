package com.keywords;

public class SuperClassB extends SuperClassA{

        String name = "Anderson";

    public static void main(String[] args) {
        SuperClassB object = new SuperClassB();
        object.printName();
    }
    public void printName(){
        System.out.println("My name is "+ super.name);
    }

}
