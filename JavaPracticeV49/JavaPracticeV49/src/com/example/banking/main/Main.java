package com.example.banking.main;

import com.example.banking.classes.BankAccount;
import com.example.banking.classes.PersonalAccount;
import com.example.banking.classes.SavingAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.toString());
        bankAccount.depositMoney(200.0);

        PersonalAccount personalAccount = new PersonalAccount();
        System.out.println(personalAccount.toString());
        personalAccount.depositMoney(-1);

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.withdrawMoney(-20);
        savingAccount.withdrawMoney(20);
        System.out.println(savingAccount.toString());
    }
}
