package com.xworkz.polymorphism.bankAccount;

public class BankAccountRunner {
        public static void main(String[] args) {
            System.out.println("--- Bank Account ---");
            BankAccount bankAccount = new BankAccount();
            bankAccount.openAccount();
            bankAccount.deposit();
            bankAccount.withdraw();
            bankAccount.checkBalance();
            bankAccount.closeAccount();

            System.out.println("--- Bank Account as Current Account ---");
            BankAccount bankAccount1 = new CurrentAccount();
            bankAccount1.openAccount();
            bankAccount1.deposit();
            bankAccount1.withdraw();
            bankAccount1.checkBalance();
            bankAccount1.closeAccount();

            System.out.println("--- Current Account ---");
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.openAccount();
            currentAccount.deposit();
            currentAccount.withdraw();
            currentAccount.checkBalance();
            currentAccount.closeAccount();
        }
    }


