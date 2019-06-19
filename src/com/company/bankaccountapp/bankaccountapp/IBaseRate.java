package com.company.bankaccountapp.bankaccountapp;

public interface IBaseRate {

    //single method to return the base rate.
    default double getBaseRate()
    {
        return 2.5;
    }
}
