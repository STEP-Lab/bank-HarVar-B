package com.thoughtworks.step.bank;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    private final Date date;
    private final int amount;
    private final AccountNumber accountNumber;

    public Transaction(Date date, int amount, AccountNumber accountNumber) {
        this.date = date;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Float.compare(that.amount, amount) == 0 &&
                Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, accountNumber   );
    }
}
