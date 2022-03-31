package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "customer_id")
public class Customer {

    private int customer_id;
    private String customer_name;

    public Customer(String customer_name) {
        this.customer_name = customer_name;
    }



}
