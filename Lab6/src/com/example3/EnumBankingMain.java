package com.example3;

public class EnumBankingMain {
    public static void initializeCustomers() {
        Customer customer = new Customer("John Doe");
        customer.addAccount(new TimeDepositAccount(500.00, DepositLength.SIX_MONTHS));
        customer.addAccount(new TimeDepositAccount(1000.00, DepositLength.THREE_MONTHS));


        System.out.println("Customer: " + customer.getName());
        for (BankAccount account : customer.getAccounts()) {
            System.out.println("Account Type: " + account.getClass().getSimpleName() +
                    ", Balance: " + account.getBalance());
        }
    }

    public static void main(String[] args) {
        initializeCustomers();
        System.out.println("Customers initialized successfully.");
    }
}

