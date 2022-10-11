package org.example.model;

import java.math.BigDecimal;

public class Product   {
    private int id;
    private String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public BigDecimal getPrice() {
        return price;
    }



    public Product() {
    }

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
