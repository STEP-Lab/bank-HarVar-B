package com.thoughtworks;

public class InsufficientFundsException extends Throwable {
    public InsufficientFundsException() {
        super("Cannot process the request due to insufficient funds.");
    }
}
