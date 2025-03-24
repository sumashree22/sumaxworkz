class BankAccountRunner{
    public static void main(String [] args) {
        System.out.println("main method started");
        BankAccount.getBalance();
        BankAccount.credit(500.00);
         BankAccount.getBalance();
         BankAccount.debit(0.00);
          BankAccount.getBalance();
          System.out.println("maain method ended");
}}