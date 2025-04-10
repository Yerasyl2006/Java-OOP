package com.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CustomerReport {
    public void generateReport(Bank bank) {
        System.out.println("CUSTOMERS REPORT");
        System.out.println("================");
        for (Customer customer : bank.getCustomers()) {
            System.out.println(customer);
            for (Account account : customer.getAccounts()) {
                System.out.println(account.getDescription() + ": current balance is " + account.getBalance());
            }
        }
    }
}

