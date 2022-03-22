package org.example.controller;

import org.example.model.CustomerData;
import org.example.service.CustomerService;
import org.example.util.Mappings;
import org.example.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

}
