package org.example.model;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CustomerData {

    private static int id_value = 1;

    private final List<Customer> customers = new ArrayList<>();

    public CustomerData() {
        addCustomer(new Customer("Per"));
        addCustomer(new Customer("Kari"));
        addCustomer(new Customer("Ola"));
        addCustomer(new Customer("Heidi"));
    }


    public void addCustomer(@NonNull Customer customer){
        customer.setCustomer_id(id_value);
        customers.add(customer);
        id_value++;
    }

    public Customer getCustomer(int customer_id){
        for (Customer customer: customers
             ) { if(customer.getCustomer_id() == customer_id)
                 return customer;
        }
        return null;
    }

    public List<Customer> getCustomers(){
        return Collections.unmodifiableList(customers);
    }

    public void removeCustomer(int id){
        ListIterator<Customer> customerListIterator = customers.listIterator();

        while(customerListIterator.hasNext()){
            Customer customer = customerListIterator.next();

            if(customer.getCustomer_id() == id){
                customerListIterator.remove();
                break;
            }
        }
    }

    public void updateCustomer(@NonNull Customer customerToUpdate){
        ListIterator<Customer> customerListIterator = customers.listIterator();

        while(customerListIterator.hasNext()){
            Customer customer = customerListIterator.next();

            if(customer.equals(customerToUpdate)){
                customerListIterator.set(customerToUpdate);
                break;
            }
        }
    }
}
