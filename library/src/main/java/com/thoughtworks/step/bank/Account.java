package com.thoughtworks.step.bank;

public class Account {

    private final AccountNumber holderName;
    private float balance;

    public Account(AccountNumber accountNumber, int balance) throws  MinimumBalanceException {
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
