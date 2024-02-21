package moreoninterfaces;

import java.util.Scanner;

interface AccountInterface{
    void deposit(int transactionAmount);
    void withdraw(int transactionAmount);
}

class Account implements AccountInterface{
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int transactionAmount){
        balance+=transactionAmount;
    }

    public void withdraw(int transactionAmount){
        if(balance<transactionAmount){
            System.out.println("Insufficient Balance!");
        }else{
            balance-=transactionAmount;
        }
    }
}

public class AccountTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accNo = sc.nextLine();
        System.out.println("Enter the Account Balance");
        int balance = sc.nextInt();
        Account account = new Account(accNo, balance);
        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the amount to deposit");
                int depositAmount = sc.nextInt();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw");
                int withdrawAmount = sc.nextInt();
                account.withdraw(withdrawAmount);
                break;
        }
        System.out.println("Your balance after the transaction is: "+account.getBalance());
    }
}

//Account Transactions
//Write a program to allow users to perform the following transactions on their bank account.
//· Deposit
//· Withdraw
//Display the balance amount after the completion of each transaction.
//Note:

//· Create a class called Account with 2 private member variables
//o accountNumber of type String
//o balance of type int

//· Include 2 argument constructor.

//· Include getter / setter method for accountNumber.

//· Include only getter for balance.

//· Create a method deposit() based on below method signature. Add transactionAmount to
// the balance instance variable.
//public void deposit(int transactionAmount)

//· Create another method withdraw() which reduces the balance amount based on the
// transactionAmount. If the balances go below zero after withdrawal, then the transaction
// should not be performed, and the earlier balance should be retained.
// This method displays insufficient balance when thhe balance is about to go below zero.
//public void withdraw(int transactionAmount)

//Input and Output Format:
//Refer sample input and output for formatting specifications.
//
//Sample Input and Output:
//All text in bold corresponds to input and the rest corresponds to output.
//
//Sample Input and Output 1:
//Enter the Account Number
//1000321
//Enter the Account Balance
//5000
//Enter 1 to deposit an amount, 2 to withdraw an amount
//1
//Enter the amount to deposit
//1000
//Your balance after the transaction is: 6000
//Sample Input and Output 2:
//Enter the Account Number
//1000321
//Enter the Account Balance
//5000
//Enter 1 to deposit an amount, 2 to withdraw an amount
//2
//Enter the amount to withdraw
//1000
//Your balance after the transaction is: 4000
//
//Sample Input and Output 3:
//Enter the Account Number
//1000321
//Enter the Account Balance
//5000
//Enter 1 to deposit an amount, 2 to withdraw an amount
//2
//Enter the amount to withdraw
//10000
//Insufficient Balance
//Your balance after the transaction is: 5000
