package com.thoughtworks.step.bank;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Cannot process the request due to insufficient funds.");
    }
}
