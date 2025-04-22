package com.xworkz.toString.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountHolderName("Rajesh Kumar");
        account.setAccountNumber("1234567890");
        account.setBalance(50000.75);
        account.setAccountType("Savings");
        account.setActive(true);
        account.setInterestRate(4.5);

        System.out.println(account.toString());
    }
}
