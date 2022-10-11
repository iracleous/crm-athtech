package org.example;

import org.example.model.*;

import java.math.BigDecimal;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //example 1.
//        int customerBalance = 1000;
//        customerBalance += 100;
//        System.out.println(
//                "Customer Balance is " + customerBalance);
//       if(customerBalance > 1050){
//            System.out.println("You are eligible to a free ticket");
//        }

        //example 2
//       double a = 0.1;
//       double b = 0.2;
//        System.out.println(a+b);
//       if ( Math.abs ((a+b) - 0.3) < 0.001)
//        {
//            System.out.println("The values are identical");
//        }
//       else System.out.println("The values are not identical");

// example 3
//        double initialAmount = 1000.0;
//        double interestRatePerYear = 0.02;
//        int years = 10;
//        double amount  = initialAmount;
//        for (int year = 0 ; year < years; year++) {
//            amount += amount * interestRatePerYear;
//        }
//        double roundedValue = (double)Math.round(amount*100) / 100;
//        System.out.println("Final amount is "+ roundedValue);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give the initial amount ");
//        double initialAmount = scanner.nextDouble();
//        System.out.println("Give the interestRatePerYear ");
//        double interestRatePerYear = scanner.nextDouble();
//        System.out.println("Give the number of the years ");
//        int years = scanner.nextInt();
//
//        double amount  = initialAmount;
//        for (int year = 0 ; year < years; year++) {
//            amount += amount * interestRatePerYear;
//        }
//        double roundedValue = (double)Math.round(amount*100) / 100;
//
//        System.out.println("Final amount is "+ roundedValue);


        Customer customer = new Customer();

        System.out.println(customer.getId());

        Customer anotherCustomer = new Customer();

        anotherCustomer.setId(45);

        Address address = new Address();
        address.setCity("Athens");
        address.setStreet("Alexandras");
        address.setZipCode("11521");

        anotherCustomer.setAddress(address);
        System.out.println(anotherCustomer.getId() + "   " + anotherCustomer.getAddress());


        Product product = new Product();
        Product product1 = new Product(23,"chips", new BigDecimal("1.30"));

        System.out.println(product1.toString());


        Employee person   = new Employee();


        Person person1 = new Customer ();

        System.out.println(person.getClass().getName());


        List<Employee> employees = new ArrayList<>();
        List<Customer> customers;

        List<Person> persons;

    }
}