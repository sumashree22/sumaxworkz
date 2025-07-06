package com.xworkz.inheritance.bank;

public class SavingAccountRunner {
    public static void main(String[] args) {

        BankAccount parent = new BankAccount();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        BankAccount parentRef = new SavingAccount();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        SavingAccount child = new SavingAccount();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
