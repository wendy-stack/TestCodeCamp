package com.squareShape;

public class ClassB {
    public static void main(String[] args) {
        ClassA value = new ClassA();
        int valueShapeSide = value.getShapeSide();
        //System.out.println(valueShapeSide);
        int valueLength = value.getShapeLength();
        int valueBreadth = value.getShapeBreadth();
        int valueArea = (valueLength*valueBreadth);
        System.out.println("The area of a square of length is: " + valueArea);

    }
}
