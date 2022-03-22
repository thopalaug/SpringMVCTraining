package org.example.service;

import org.example.model.Customer;
import org.example.model.CustomerData;

public interface CustomerService {

    void addCustomer(Customer customer);
    Customer getCustomer(int id);
    CustomerData getData();


}
