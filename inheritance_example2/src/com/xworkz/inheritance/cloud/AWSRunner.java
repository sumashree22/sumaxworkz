package com.xworkz.inheritance.cloud;

public class AWSRunner {
    public static void main(String[] args) {

        CloudServiceProvider parent = new CloudServiceProvider();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        CloudServiceProvider parentRef = new AWS();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        AWS child = new AWS();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
