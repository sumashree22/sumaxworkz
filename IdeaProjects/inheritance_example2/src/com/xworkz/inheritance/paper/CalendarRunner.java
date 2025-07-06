package com.xworkz.inheritance.paper;

public class CalendarRunner {
    public static void main(String[] args) {

        PaperProducts parent = new PaperProducts();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        PaperProducts parentRef = new Calendar();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Calendar child = new Calendar();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
