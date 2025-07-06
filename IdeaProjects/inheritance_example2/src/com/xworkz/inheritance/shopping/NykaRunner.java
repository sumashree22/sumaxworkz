package com.xworkz.inheritance.shopping;

public class NykaRunner {
    public static void main(String[] args) {

        Ecommerce parent = new Ecommerce();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        Ecommerce parentRef = new Nyka();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Nyka child = new Nyka();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
