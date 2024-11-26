package Bankaccount;

public class SavingsAccount extends BankAccount {
    private static final double SAVINGS_INTEREST_RATE = 0.04; // 4% interest rate for savings accounts
    private static final double MIN_BALANCE = 500; // Minimum balance requirement

    // Constructor to initialize SavingsAccount
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance); // Calls the constructor of Bankaccount
    }

    // Override the calculateInterest method
    @Override
    public double calculateInterest() {
        double interest = getBalance() * SAVINGS_INTEREST_RATE;
        System.out.println("Interest on savings account: " + interest);
        return interest;
    }

    // Override the withdraw method to include minimum balance check
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Insufficient funds: Cannot withdraw, minimum balance required is " + MIN_BALANCE);
        } else {
            super.withdraw(amount); // Call the withdraw method from Bankaccount
        }
    }

    // Additional method to check if the balance is below the minimum required
    public void checkMinimumBalance() {
        if (getBalance() < MIN_BALANCE) {
            System.out.println("Warning: Balance is below the minimum required. Please maintain at least " + MIN_BALANCE);
        }
    }

    @Override
    public void displayDetails(){
        super.displayDetails(); // calling the parent class method
        System.out.println("Minimum Balance: " + MIN_BALANCE);
        System.out.println("Interest Rate: " + (SAVINGS_INTEREST_RATE * 100) + "%");
    }
}
