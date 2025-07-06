package com.xworkz.inheritance.textile;

public class FabricRunner {
    public static void main(String[] args) {

        Cotton parent = new Cotton();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Cotton parentRef = new Fabric();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Fabric child = new Fabric();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
