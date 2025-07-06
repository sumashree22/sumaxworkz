package com.xworkz.inheritance.payment;

public class GpayRunner {
    public static void main(String[] args) {

        DigitalPayment parent = new DigitalPayment();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        DigitalPayment parentRef = new Gpay();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Gpay child = new Gpay();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
