package com.thoughtworks.step.bank;

public class MinimumBalanceException extends Exception {
    public MinimumBalanceException() {
        super("Insufficient balance to create an account.");
    }
}
