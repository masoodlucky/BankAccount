package Bankaccount;

public class BankAccount {  // Renamed class to follow naming convention
    private int accountNumber;
    private double balance;
    private double r; // Interest rate
    private int t; // Time
    

    // Constructor with interest rate and time
    public BankAccount(int accountNumber, double balance, double r, int t){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.r = r;
        this.t = t;
    }

    // Constructor without interest rate and time (defaults)
    public BankAccount(int accountNumber, double balance){
        this(accountNumber, balance, 0.05, 1);  // Default interest rate 5% and 1 year time
    }

    // Deposit method
    public void deposit(double amount){
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Display account details
    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Calculate interest
    public double calculateInterest(){
        double interest = balance * r * t;
        System.out.println("Calculates interest: " + interest);
        return interest;
    }

    // Getter and Setter methods
    public int getAccountNumber(){
        return accountNumber; 
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setInterestRate(double r){
        this.r = r;
    }

    public void setTime(int t){
        this.t = t;
    }
}

class account{

}
