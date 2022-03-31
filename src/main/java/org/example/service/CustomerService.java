package org.example.service;

import org.example.model.Customer;
import org.example.model.CustomerData;

public interface CustomerService {

    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    Customer getCustomer(int id);
    void updateCustomer(Customer customer);
    CustomerData getData();


}
