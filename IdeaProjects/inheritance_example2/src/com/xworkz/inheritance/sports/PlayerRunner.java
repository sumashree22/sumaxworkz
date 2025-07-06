package com.xworkz.inheritance.sports;

public class PlayerRunner {
    public static void main(String[] args) {

        Football parent = new Football();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Football parentRef = new Player();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Player child = new Player();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
