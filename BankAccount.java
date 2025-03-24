class BankAccount{
    static double balance;
    public static void credit(double ammount){
        System.out.println("credit started");
        if(ammount>0.00)
        balance=balance+ammount;
        else
        System.out.println("invalid amount");
        System.out.println("credit completed");

    }
    public static void debit(double ammount){
        System.out.println("debit started");
        if(balance>=ammount)
        balance=balance-ammount;
        else
        System.out.println("insufficient balance");
        System.out.println("debit completed");
    }
    public static void getBalance(){
        System.out.println("balance is "+balance);
    }
}