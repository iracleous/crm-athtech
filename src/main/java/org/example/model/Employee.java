package org.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Person{


    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
