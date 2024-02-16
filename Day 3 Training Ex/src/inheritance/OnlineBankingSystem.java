package inheritance;

class Account {
    private long accountNumber;
    private double balance;
    private String accountHolder;

    Account(long accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(long accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    // Specific features for savings account
    void calculateInterest() {
        // Implementation...
        System.out.println("Interest: "+getBalance()*0.15);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(long accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    // Specific features for current account
    void handleOverdraft(double withdraw) {
        // Implementation...
        System.out.println(getBalance()>withdraw?("Success!\n" + "Acc. Balance: $"+(getBalance()-withdraw)):("you don't have $"+withdraw+"!\nAcc. Balance: $"+getBalance()));
    }
}


public class OnlineBankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000.0, "John Doe");
        CurrentAccount currentAccount = new CurrentAccount(789012, 2000.0, "Jane Smith");
        savingsAccount.calculateInterest();
        currentAccount.handleOverdraft(1000);
        currentAccount.handleOverdraft(3000);
    }
}

//Problem Statement 1: Online Banking System
//In an online banking system, there is a need to model different types of accounts, such as Savings Account and Current Account, each with specific behaviors. Implement an inheritance hierarchy for the account types, considering features like interest calculation for savings accounts and overdraft limit for current accounts.
//
//Requirements:
//Design an inheritance hierarchy with a base class "Account" containing properties like accountNumber, balance, and accountHolder.
//Implement methods for interest calculation in SavingsAccount and overdraft handling in CurrentAccount.
//Ensure that the code allows easy addition of new account types in the future.
//
//Sample Code Stub:
//class Account {
//    long accountNumber;
//    double balance;
//    String accountHolder;
//
//    Account(long accountNumber, double balance, String accountHolder) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.accountHolder = accountHolder;
//    }
//}
//
//class SavingsAccount extends Account {
//    // Specific features for savings account
//    void calculateInterest() {
//        // Implementation...
//    }
//}
//
//class CurrentAccount extends Account {
//    // Specific features for current account
//    void handleOverdraft() {
//        // Implementation...
//    }
//}
//
//
//Sample Input:
//Creating instances of SavingsAccount and CurrentAccount:
//SavingsAccount savingsAccount = new SavingsAccount(123456, 1000.0, "John Doe");
//CurrentAccount currentAccount = new CurrentAccount(789012, 2000.0, "Jane Smith");
