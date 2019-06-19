package com.company.bankaccountapp.bankaccountapp;

import com.company.bankaccountapp.bankaccountapp.Account;

public class Savings extends Account {

    //list properties specific to savings account
    double safetyDepositBoxID;
    double safetyDepositKey;

    //constructor to initialize saving properties
    public Savings(String name, String ssn, double balance)
    {
        super(name, ssn, balance);
        accountNumber = "1"  + accountNumber;
        setSafetyDepositBox();
    }
    @Override
    public void setRate()
    {
        rate = getBaseRate()-0.25;
    }
    private void setSafetyDepositBox()
    {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositKey = (int)(Math.random()*Math.pow(10,4));
    }
    public void showInfo()
    {
        System.out.println("Account Type: Saving");
        super.showInfo();
        System.out.println(
                "Your Savings Account features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + safetyDepositKey
        );
    }
    //list methods specific to savings account
}
