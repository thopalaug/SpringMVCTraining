package org.example.model;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerData {

    private static int id_value = 1;

    private final List<Customer> listOfCustomers = new ArrayList<>();

    public CustomerData() {
        addCustomer(new Customer("Per"));
        addCustomer(new Customer("Kari"));
        addCustomer(new Customer("Ola"));
        addCustomer(new Customer("Heidi"));
    }


    public void addCustomer(@NonNull Customer customer){
        customer.setCustomer_id(id_value);
        listOfCustomers.add(customer);
        id_value++;
    }

    public Customer getCustomer(int customer_id){
        for (Customer customer: listOfCustomers
             ) { if(customer.getCustomer_id() == customer_id)
                 return customer;
        }
        return null;
    }

    public List<Customer> getCustomers(){
        return Collections.unmodifiableList(listOfCustomers);
    }


}
