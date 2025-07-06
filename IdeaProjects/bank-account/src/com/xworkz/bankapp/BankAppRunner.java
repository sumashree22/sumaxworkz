package com.xworkz.bankapp;


import com.xworkz.bankapp.bankaccount.BankAccount;

public class BankAppRunner {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.credit(50000);
        double balance= bankAccount.getBalance();
        System.out.println("the available balance is"+balance);
        bankAccount.debit(5000);
        balance= bankAccount.getBalance();
        System.out.println("the available balance is"+balance);

        BankAccount friendsAccount=new BankAccount();
        bankAccount.transfer(friendsAccount,5000);
        balance= friendsAccount.getBalance();
        System.out.println("the available balance in my friends Account is :"+balance);

        BankAccount fatherAccount=new BankAccount();
        bankAccount.transfer(fatherAccount,5000);
        balance= fatherAccount.getBalance();
        System.out.println("the available balance in my friends Account is :"+balance);

         balance=bankAccount.getBalance();
        System.out.println("available balance in my account is :"+balance);

        BankAccount shubhaAccount=new BankAccount();
        bankAccount.transfer(shubhaAccount,200);
        balance= shubhaAccount.getBalance();
        System.out.println("balance in shubha's account is:"+balance);


    }}

