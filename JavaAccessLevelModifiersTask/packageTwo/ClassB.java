package com.packageTwo;

import com.packageOne.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA newMethod = new ClassA();
        newMethod.methodInClassA();
        ClassB newMethodB = new ClassB();
        newMethodB.methodInClassB();
    }

    private void methodInClassB (){
        System.out.println("This can only be accessed in class B");
    }

}
