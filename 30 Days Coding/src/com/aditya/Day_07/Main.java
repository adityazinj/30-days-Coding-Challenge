package com.aditya.Day_07;

//Create a Java program to simulate a Bank Account Management System
// using inheritance and polymorphism.

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    protected double balance;


    public BankAccount(String accountHolderName, double balance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void deposit(double amount) {
        balance+=amount;
        System.out.println("Account credited with "+amount+" Your Account Balance is "+balance);
    }
    void withdraw(double amount){}
}
//Subclass 1
class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, double balance, String accountNumber) {
        super(accountHolderName, balance, accountNumber);
    }
    int limit = 5;

    @Override
    void withdraw(double amount) {
        if (limit > 0) {
            if (amount > balance) {
                System.out.println("Insufficient Balance!!!");
            }
            else {
                balance -= amount;
                System.out.println("Account debited with "+amount+" Your Account Balance is "+balance);
                limit--;
            }
        }
        else{
            System.out.println("Withdraw Limit Exceeded!!!");
        }
    }
}
//SubClass 2
class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolderName, double balance, String accountNumber) {
        super(accountHolderName, balance, accountNumber);
    }
    final double overdraft = 50000;
    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance-=amount;
            System.out.println("Your account is debited with "+amount+" your balance is "+balance);
        }
        else {
            final double update_amount = overdraft-amount;
            if (update_amount > 0) {
                System.out.println("Your account is debited with "+amount+" your overdraft is "+update_amount);
            }
            else {
                System.out.println("insufficient balance!!!");
            }
        }
    }
}

public class Main {
        public static void main(String[] args) {
            System.out.println("Saving Account :-");
            SavingsAccount Aditya = new SavingsAccount("Aditya Zinjurke",100000,"S1234567J");
            Aditya.deposit(50000);
            Aditya.withdraw(3000);
            Aditya.withdraw(3000);
            Aditya.withdraw(3000);
            Aditya.withdraw(300);
            Aditya.withdraw(30);
            Aditya.withdraw(30);

            System.out.println();

            System.out.println("Current Account :-");
            CurrentAccount Aniket = new CurrentAccount("Aniket Zinjurke",100000,"S9876523J");
            Aniket.deposit(30000);
            Aniket.withdraw(60000);
            Aniket.withdraw(70000);
            Aniket.withdraw(40000);

    }
}
