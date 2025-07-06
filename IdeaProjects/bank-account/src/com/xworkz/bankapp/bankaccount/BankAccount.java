package com.xworkz.bankapp.bankaccount;

public class BankAccount {
    private  double balance;

    public void debit( double ammount){
        balance=balance-ammount;

    }
    public void credit(double ammount){
        balance=balance+ammount;
    }
    public double getBalance(){
        return balance;

    }
    // BankAccount benificiery= friendsAccount;
    public void transfer(BankAccount friendsAccount,double ammount){
        this.debit(ammount);
        friendsAccount.credit(ammount);
    }
}
