package com.xworkz.inheritance.technology;

public class MobileRunner {
    public static void main(String[] args) {

        Gadgets parent = new Gadgets();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Gadgets parentRef = new Mobile();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Mobile child = new Mobile();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
