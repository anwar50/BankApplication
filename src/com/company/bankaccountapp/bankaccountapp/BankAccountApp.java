package com.company.bankaccountapp.bankaccountapp;


import java.util.LinkedList;
import java.util.List;
import com.company.bankaccountapp.utilities.*;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class BankAccountApp{

    public static void main(String[] args) {

        String file = "C:\\Users\\anwardont delete my\\Desktop\\BankApplication\\NewBankAccounts.csv";

        List<Account> accounts = new LinkedList<Account>();


        List<String[]> newAccountHolder = CSV.read(file);

        for(String[] accountHolder: newAccountHolder)
        {

            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String type = accountHolder[2];
            double Deposit = Double.parseDouble(accountHolder[3]);

            //System.out.println(name + " " + SSN + " " + type + " £" + Deposit);

            if(type.equals("Savings"))
            {

                accounts.add(new Savings(name, SSN, Deposit));
            }
            else if(type.equals("Checking"))
            {

                accounts.add(new Checking(name, SSN, Deposit));

            }
            else
            {
                System.out.println("Error reading account type!");
            }
        }

        for(Account acc1 : accounts)
        {
            System.out.println("\n****************");
            acc1.showInfo();
        }
        //create accounts based on these data retrieved

        accounts.get((int)(Math.random()*accounts.size())).deposit(1000);
    }
}
