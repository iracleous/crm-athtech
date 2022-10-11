package org.example.model;

import java.math.BigDecimal;
import java.util.Date;


public class Customer extends  Person {


    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}