package com.thoughtworks.step.bank;

import com.thoughtworks.InsufficientFundsException;
import com.thoughtworks.MinimumBalanceException;

public class Account {

    private final String holderName;
    private float balance;

    public Account(String accountNumber, int balance) throws  MinimumBalanceException {
        this.holderName = accountNumber;

        int MINIMUMBALANCE = 1000;
        if(balance < MINIMUMBALANCE) throw new MinimumBalanceException();
        this.balance =(float) balance;
    }

    public Object getBal() {
        return balance;
    }

    public void debit(int amount) throws  InsufficientFundsException {
        if(amount > this.balance) throw new InsufficientFundsException();
        this.balance -= amount;
    }

    public void credit(int amount){
        this.balance += amount;
    }
}
