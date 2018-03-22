package com.thoughtworks.step.bank;

public class AccountNumber {
    private final String PATTERN = "\\d{4}[-]\\d{4}";
    private final String number;

    public AccountNumber(String number) throws InvalidAccountNumberException{
        validateAccountNumber(number);
        this.number = number;
    }

    private void validateAccountNumber(String number) throws InvalidAccountNumberException{
        if (!number.matches(PATTERN)) throw new InvalidAccountNumberException();
    }
}
