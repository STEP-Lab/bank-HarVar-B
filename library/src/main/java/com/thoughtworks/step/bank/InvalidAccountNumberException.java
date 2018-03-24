package com.thoughtworks.step.bank;

public class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException() {
        super("Invalid format for account number.");
    }
}
