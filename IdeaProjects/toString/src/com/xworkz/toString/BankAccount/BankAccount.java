package com.xworkz.toString.BankAccount;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private String accountType; // Savings, Checking, etc.
    private boolean isActive;
    private double interestRate; // Annual interest rate in percentage

    @Override
    public String toString() {
        return "Bank Account Details:\n" +
                "Account Holder = " + this.accountHolderName + "\n" +
                "Account Number = " + this.accountNumber + "\n" +
                "Balance = ₹" + this.balance + "\n" +
                "Account Type = " + this.accountType + "\n" +
                "Is Active = " + this.isActive + "\n" +
                "Interest Rate = " + this.interestRate + "%";
    }
}
