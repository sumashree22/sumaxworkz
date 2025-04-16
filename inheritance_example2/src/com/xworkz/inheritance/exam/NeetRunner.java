package com.xworkz.inheritance.exam;

public class NeetRunner {
    public static void main(String[] args) {

        EntranceExam parent = new EntranceExam();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        EntranceExam parentRef = new Neet();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Neet child = new Neet();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
