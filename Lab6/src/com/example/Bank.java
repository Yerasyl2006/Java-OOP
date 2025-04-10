package com.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customers = new ArrayList<>();

    public void addCustomer(String firstName, String lastName) {
        customers.add(new Customer(firstName, lastName));
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

