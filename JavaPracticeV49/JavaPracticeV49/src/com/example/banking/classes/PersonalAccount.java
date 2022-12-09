package com.example.banking.classes;

import java.util.UUID;

public class PersonalAccount extends BankAccount {
    public PersonalAccount() {
        this.setAccountNo(UUID.randomUUID().toString().substring(0, 6));
        this.setBalance(0.0);
        this.setAccountType("Personal account");
    }
}
