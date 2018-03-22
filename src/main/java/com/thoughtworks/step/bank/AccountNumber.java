package com.thoughtworks.step.bank;

import com.thoughtworks.InvalidAccountNumberException;

import java.util.regex.Pattern;

public class AccountNumber {
    private final Pattern PATTERN = Pattern.compile("\\d{4}[-]\\d{4}");
    private final String number;

    public AccountNumber(String number) throws InvalidAccountNumberException{
        validateAccountNumber(number);
        this.number = number;
    }

    private void validateAccountNumber(String number) throws InvalidAccountNumberException{
        if (!number.matches("\\d{4}[-]\\d{4}")) throw new InvalidAccountNumberException();
    }
}
