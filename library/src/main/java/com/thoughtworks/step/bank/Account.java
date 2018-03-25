package com.thoughtworks.step.bank;

import java.math.BigDecimal;

public class Account {

    private final AccountNumber holderName;
    private BigDecimal balance;

    public Account(AccountNumber accountNumber, BigDecimal balance) throws  MinimumBalanceException {
        this.holderName = accountNumber;

        int MINIMUMBALANCE = 1000;
        if(balance.intValue() < MINIMUMBALANCE) throw new MinimumBalanceException();
        this.balance = balance;
    }

    public Object getBal() {
        return balance;
    }

    public void debit(BigDecimal amount) throws  InsufficientFundsException {
        if(amount.compareTo(balance) > 0) throw new InsufficientFundsException();
        balance = balance.subtract(amount);
    }

    public void credit(BigDecimal amount) { balance = balance.add(amount);
    }
}
