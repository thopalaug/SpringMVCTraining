package org.example.controller;

import org.example.model.Customer;
import org.example.model.CustomerData;
import org.example.service.CustomerService;
import org.example.util.AttributeNames;
import org.example.util.Mappings;
import org.example.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    // -- Fields --
    private final CustomerService customerService;

    // -- Constructor --
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Model Attributes and Mappings

    @ModelAttribute
    public CustomerData customerData(){
        return customerService.getData();
    }

    @GetMapping(Mappings.CUSTOMER)
    public String customer(){
        return ViewNames.CUSTOMER_LIST;
    }

    @GetMapping(Mappings.ADD_CUSTOMER)
    public String addEditCustomer(Model model){
        Customer customer = new Customer("");
        model.addAttribute(AttributeNames.CUSTOMER, customer);
        return ViewNames.ADD_CUSTOMER;
    }

    @PostMapping(Mappings.ADD_CUSTOMER)
    public String addCustomer(@ModelAttribute(AttributeNames.CUSTOMER) Customer customer){
        customerService.addCustomer(customer);
        return "redirect:/" + Mappings.CUSTOMER;
    }

    @GetMapping(Mappings.DELETE_CUSTOMER)
    public String deleteCustomer(@RequestParam int customer_id){
        customerService.deleteCustomer(customer_id);
        return "redirect:/" + Mappings.CUSTOMER;
    }

    @GetMapping(Mappings.HOME)
    public String home(){
        return ViewNames.HOME;
    }

}
