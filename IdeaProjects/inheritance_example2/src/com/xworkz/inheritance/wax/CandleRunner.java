package com.xworkz.inheritance.wax;

public class CandleRunner {
    public static void main(String[] args) {

        WaxItem parent = new WaxItem();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        WaxItem parentRef = new Candle();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Candle child = new Candle();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
