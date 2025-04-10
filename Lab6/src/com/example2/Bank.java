package com.example2;

public class Bank {
    private static final Bank instance = new Bank();


    private Customer[] customers;
    private int numberOfCustomers;

    private Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public static Bank getInstance() {
        return instance;
    }

    public void addCustomer(Customer customer) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = customer;
            numberOfCustomers++;
        }
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
}