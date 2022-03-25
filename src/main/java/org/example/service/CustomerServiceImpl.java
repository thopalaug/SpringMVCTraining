package org.example.service;

import org.example.model.Customer;
import org.example.model.CustomerData;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    private final CustomerData customerData = new CustomerData();

    @Override
    public void addCustomer(Customer customer) {
        customerData.addCustomer(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerData.getCustomer(id);
    }

    @Override
    public CustomerData getData() {
        return customerData;
    }

    @Override
    public void deleteCustomer(int id) {
        customerData.removeCustomer(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }
}
