package com.example3;

import java.util.Calendar;
import java.util.Date;

public class TimeDepositAccount extends BankAccount {
    private Date maturityDate;

    public TimeDepositAccount(double balance, DepositLength duration) {
        super(balance);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, duration.getDays());
        this.maturityDate = cal.getTime();
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    @Override
    public String toString() {
        return "Account Type: TimeDepositAccount, Balance: " + getBalance() +
                ", Maturity Date: " + maturityDate;
    }
}
