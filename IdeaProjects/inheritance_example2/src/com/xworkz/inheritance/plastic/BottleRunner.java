package com.xworkz.inheritance.plastic;

public class BottleRunner {
    public static void main(String[] args) {

        Plastic parent = new Plastic();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Plastic parentRef = new Bottle();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Bottle child = new Bottle();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
