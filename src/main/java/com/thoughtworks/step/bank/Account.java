package com.thoughtworks.step.bank;

import com.thoughtworks.InsufficientFundsException;
import com.thoughtworks.InvalidAccountNumberException;
import com.thoughtworks.MinimumBalanceException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final Pattern PATTERN = Pattern.compile("\\d{4}[-]\\d{4}");
    private final String holderName;
    private float balance;

    public Account(String accountNumber, int balance) throws InvalidAccountNumberException, MinimumBalanceException {

        Matcher matcher = PATTERN.matcher(accountNumber);
        boolean isValidAccountNumber = matcher.matches();
        if(!isValidAccountNumber) throw new InvalidAccountNumberException();
        this.holderName = accountNumber;

        int MINIMUMBALANCE = 1000;
        if(balance < MINIMUMBALANCE) throw new MinimumBalanceException();
        this.balance =(float) balance;
    }

    public Object getBal() {
        return balance;
    }

    public String getName() {
        return holderName;
    }

    public void debit(int amount) throws  InsufficientFundsException {
        if(amount > this.balance) throw new InsufficientFundsException();
        this.balance -= amount;
    }

    public void credit(int amount){
        this.balance += amount;
    }
}
