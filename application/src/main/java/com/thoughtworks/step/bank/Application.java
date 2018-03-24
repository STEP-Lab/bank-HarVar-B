package com.thoughtworks.step.bank;

public class Application {
    public static void main(String args[]) throws InvalidAccountNumberException, MinimumBalanceException {
        Account harvar = new Account(new AccountNumber("1111-1111"),1500);
        System.out.println(harvar.getBal());
    }
}
