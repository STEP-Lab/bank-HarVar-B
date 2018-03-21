package com.thoughtworks;

public class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException() {
        super("Invalid format for account number.");
    }
}
