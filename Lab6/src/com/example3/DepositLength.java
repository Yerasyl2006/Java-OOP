package com.example3;
import com.example3.DepositLength;
public enum DepositLength {
    THREE_MONTHS(90),
    SIX_MONTHS(180);

    private final int days;

    private DepositLength(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}