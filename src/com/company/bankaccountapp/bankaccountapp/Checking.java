package com.company.bankaccountapp.bankaccountapp;

import com.company.bankaccountapp.bankaccountapp.Account;

public class Checking extends Account {

    //properties specific to checking
    double debitNumber;
    double debitPIN;

    //constructor to initialize checking
    public Checking(String name, String ssn, double balance)
    {
        super(name, ssn, balance);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate()
    {
        rate = getBaseRate()*0.15;
    }
    private void setDebitCard()
    {
        debitNumber = (int)(Math.random()*Math.pow(10, 12));
        debitPIN = (int)(Math.random()*Math.pow(10, 4));
    }
    public void showInfo()
    {
        System.out.println("Account Type: Checking");
        super.showInfo();
        System.out.println(
                "Your checking account features" +
                        "\n Debit Card Number: " + debitNumber +
                        "\n Debit Card PIN: " + debitPIN
        );
    }
    //list methods specific to checking
}
