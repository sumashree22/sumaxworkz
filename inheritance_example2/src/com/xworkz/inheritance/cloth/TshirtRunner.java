package com.xworkz.inheritance.cloth;

public class TshirtRunner {
    public static void main(String[] args) {

        Cloth parent = new Cloth();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Cloth parentRef = new Tshirt();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Tshirt child = new Tshirt();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
