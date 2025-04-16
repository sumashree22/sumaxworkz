package com.xworkz.inheritance.education;

public class CbseRunner {
    public static void main(String[] args) {

        EducationBoard parent = new EducationBoard();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        EducationBoard parentRef = new Cbse();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Cbse child = new Cbse();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
