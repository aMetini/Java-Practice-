package com.example.banking.classes;

import java.util.UUID;

import com.example.banking.interfaces.BankOperations;

public class BankAccount implements BankOperations {
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount() {
        this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
        this.balance = 0;
        this.accountType = "Bank account";
    }

    public String getAccountNo() {
        return accountNumber;
    }

    public void setAccountNo(String accountNo) {
        accountNumber = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String acctType) {
        accountType = acctType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double acctBalance) {
        balance = acctBalance;
    }

    public String toString() {
        return "BankAccount [Account number = " + accountNumber + ", Balance = " + balance + ", Account type = " + accountType + "]";
    }
    

    @Override
    public void withdrawMoney(double amount) {
        // TODO Auto-generated method stub
        if (amount > 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("You cannot withdraw a negative value!");
        }
        
    }

    @Override
    public void depositMoney(double amount) {
        // TODO Auto-generated method stub
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("You cannot deposit a negative value!");
        }
    }
    
}
