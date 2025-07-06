package com.xworkz.polymorphism.bankAccount;

public class CurrentAccount extends BankAccount {
    @Override
        public void openAccount() {
            System.out.println("Current Account: Opening a current account with no interest.");
        }

        @Override
        public void deposit() {
            System.out.println("Current Account: Depositing money for daily transactions.");
        }

        @Override
        public void withdraw() {
            System.out.println("Current Account: Withdrawing money without any restrictions.");
        }

        @Override
        public void checkBalance() {
            System.out.println("Current Account: Checking the balance available for transactions.");
        }

        @Override
        public void closeAccount() {
            System.out.println("Current Account: Closing the current account with a zero balance requirement.");
        }
    }


