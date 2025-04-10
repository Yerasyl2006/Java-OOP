package com.example;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.Calendar;

public class AbstractBankingMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;


        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 180);

        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(0);
        customer.addAccount(new TimeDepositAccount(500.00, cal.getTime()));
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(2);
        customer.addAccount(new TimeDepositAccount(1500.00, cal.getTime()));
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(3);

        customer.addAccount(bank.getCustomer(2).getAccount(1));
        customer.addAccount(new TimeDepositAccount(150.00, cal.getTime()));


        CustomerReport report = new CustomerReport();
        report.generateReport(bank);
    }
}
