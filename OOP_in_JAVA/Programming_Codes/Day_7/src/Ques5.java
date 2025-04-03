import java.util.Scanner;

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class BankAccount {
 private int accountNumber;
 private String accountHolder;
 private double balance;

 // Constructor
 public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = initialBalance;
 }

 // Method to withdraw money
 public void withdraw(double amount) throws InsufficientFundsException {
     if (balance < amount) {
         throw new InsufficientFundsException("Insufficient funds: Current balance is " + balance);
     }
     balance -= amount; // Deduct the amount from balance
     System.out.println("Withdrawal successful. New balance: " + balance);
 }

 // Method to deposit money
 public void deposit(double amount) {
     balance += amount; // Add money to the balance
     System.out.println("Deposit successful. New balance: " + balance);
 }

 public int getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }
}

public class Ques5 {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(12345, "John Doe", 500.0);
        Scanner scanner = new Scanner(System.in);

        // Try withdrawing an amount greater than the balance
        try {
            System.out.print("Enter amount to withdraw: ");
            double amountToWithdraw = scanner.nextDouble();
            account.withdraw(amountToWithdraw); // Attempt to withdraw
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage()); // Handle the exception
        }

        // Deposit money and retry the withdrawal
        System.out.print("Enter amount to deposit: ");
        double amountToDeposit = scanner.nextDouble();
        account.deposit(amountToDeposit); // Deposit money

        // Retry the withdrawal
        try {
            System.out.print("Enter amount to withdraw again: ");
            double amountToWithdrawAgain = scanner.nextDouble();
            account.withdraw(amountToWithdrawAgain); // Attempt to withdraw again
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage()); // Handle the exception
        }

        scanner.close(); // Close the scanner
    }
}