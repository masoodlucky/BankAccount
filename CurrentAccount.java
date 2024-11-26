package Bankaccount;

public class CurrentAccount extends BankAccount{
    private double overdraftlimit;
    CurrentAccount (int accountNumber, double balance, double overdraftlimit){
        super(accountNumber,balance);
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() - amount < -overdraftlimit){
            System.out.println("Overdraft limit exceeded! withdrawal denied!!!");
        }
        else {
            super.withdraw(amount);
        }
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Overdraft limit: " + overdraftlimit);
    }
}
