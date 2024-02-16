package interfaces;

abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        // Implement deposit logic
    }

    void withdraw(double amount) {
        // Implement withdraw logic
    }

    void displayBalance() {
        // Implement display balance logic
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Override necessary methods for savings account
    void deposit(double amount) {
        // Implement deposit logic
        setBalance(getBalance()+amount);

    }
    void displayBalance() {
        // Implement display balance logic
        System.out.println("Savings Account Balance: $"+getBalance());
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    // Override necessary methods for checking account
    void withdraw(double amount) {
        // Implement withdraw logic
        setBalance(getBalance()-amount);
    }
    void displayBalance() {
        // Implement display balance logic
        System.out.println("Checking Account Balance: $"+getBalance());
    }
}

public class AbstractClassWithConcreteMethods {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(0);
        savingsAccount.deposit(500);
        savingsAccount.displayBalance();

        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.withdraw(100);
        checkingAccount.displayBalance();
    }
}


//Problem Statement 4: Abstract Class with Concrete Methods
//Create a banking system with abstract class BankAccount having concrete methods for deposit, withdraw, and display balance. Implement two account types: Savings and Checking, inheriting from the abstract class.
//
//
//Requirements:
//Abstract class BankAccount with concrete methods
//Concrete classes SavingsAccount and CheckingAccount inheriting from BankAccount
//Override necessary methods in the child classes
//
//Operations to Perform:
//Implement deposit and withdraw methods in both account types
//Display the balance using the abstract class method
//
//Sample Code Stub:
//abstract class BankAccount {
//    void deposit(double amount) {
//        // Implement deposit logic
//    }
//
//    void withdraw(double amount) {
//        // Implement withdraw logic
//    }
//
//    void displayBalance() {
//        // Implement display balance logic
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    // Override necessary methods for savings account
//}
//
//class CheckingAccount extends BankAccount {
//    // Override necessary methods for checking account
//}
//
//Sample Input:
//Deposit $500 in a Savings Account
//Withdraw $100 from a Checking Account
//
//Sample Output:
//Savings Account Balance: $500.00
//Checking Account Balance: $900.00
