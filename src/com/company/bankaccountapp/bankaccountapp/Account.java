package com.company.bankaccountapp.bankaccountapp;

public abstract class Account implements IBaseRate {

    //list properties for both the savings and checking accounts
    private String name;
    private String SSN;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index = 10000;

    //constructor that sets the base properties and initialize account
    public Account(String name, String SSN, double balance)
    {
        this.name = name;
        this.SSN = SSN;
        this.balance = balance;


        //set the account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }
    public abstract void setRate();
    private String setAccountNumber()
    {

        String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNum = (int)(Math.random()*Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID  + randomNum;
    }
    public void compound()
    {
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }
        //Transactions
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void transfer(String where, double amount)
    {
        balance = balance - amount;
        System.out.print("Transferring $" + amount + " to " + where);
    }
    public void printBalance()
    {
        System.out.println("Your balance is now: $" + balance);
    }
    public void showInfo()
    {
        System.out.println(
                "Name: " + name +
                        "\nAccount number: " + accountNumber +
                        "\nBalance: " + balance +
                        "\nRate: " + rate + "%"
        );
    }
    //list common methods such as deposit / withdraw
}
