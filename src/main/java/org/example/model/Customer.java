package org.example.model;

import lombok.Data;

@Data
public class Customer {

    private int customer_id;
    private String customer_name;

    public Customer(String customer_name) {
        this.customer_name = customer_name;
    }



}
