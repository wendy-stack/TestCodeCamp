package com.packageOne;

import com.packageTwo.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassA newMethod = new ClassA();
        newMethod.methodInClassA();
        ClassB newMethodB = new ClassB();
        newMethodB.methodInClassB();
    }

    public void methodInClassA (){
        System.out.println("This method was created in classA");
    }

}
