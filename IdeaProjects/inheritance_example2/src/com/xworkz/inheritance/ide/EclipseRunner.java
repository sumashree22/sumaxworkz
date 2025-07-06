package com.xworkz.inheritance.ide;

public class EclipseRunner {
    public static void main(String[] args) {

        DevelopmentTool parent = new DevelopmentTool();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        DevelopmentTool parentRef = new Eclipse();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Eclipse child = new Eclipse();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
