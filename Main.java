package Bankaccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(12345, 1000);

        savings.displayDetails(); // Display initial details
        savings.deposit(500); // Deposit money
        savings.displayDetails(); // Display updated details

        savings.withdraw(800); // Withdraw money
        savings.displayDetails(); // Display updated details

        savings.withdraw(1300); // Attempt to withdraw more than allowed
        savings.displayDetails(); // Display updated details

        savings.checkMinimumBalance(); // Check if balance is below the minimum

        savings.calculateInterest(); // Calculate interest
    }
}

