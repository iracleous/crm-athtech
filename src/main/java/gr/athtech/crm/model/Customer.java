package gr.athtech.crm.model;

import java.math.BigDecimal;


public class Customer extends  Person {


    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}