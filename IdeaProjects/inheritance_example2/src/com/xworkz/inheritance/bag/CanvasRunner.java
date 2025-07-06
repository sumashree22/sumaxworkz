package com.xworkz.inheritance.bag;

public class CanvasRunner {
    public static void main(String[] args) {

        Bag parent = new Bag();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Bag parentRef = new Canvas();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Canvas child = new Canvas();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
