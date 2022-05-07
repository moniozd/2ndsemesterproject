/*
package com.example.demo.controller;

import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class RegisterCustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/register_customer")
    public String viewCustomer(Model model) {
        model.addAttribute("customers", customerService.fetchAll());
        return "register_customer/register_customer";
    }

}
*/
