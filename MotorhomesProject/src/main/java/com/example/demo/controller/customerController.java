package com.example.demo.controller;

import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class customerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/register_customer")
    public String registerCustomerPage(Model model) {
        model.addAttribute("customers", customerService.fetchAll());
        return "register_customer/register_customer";
    }

    @PostMapping("/register_customer")
    public String addCustomer(@ModelAttribute CustomerModel customer) {
        customerService.addCustomer(customer);
        return "redirect:/register_customer";
    }

    @GetMapping("/delete_customer/{id}")
    public String deleteCustomer(@PathVariable("id") long id) {
        boolean deleted = customerService.deleteCustomer(id);
        return "redirect:/register_customer";
    }

    @GetMapping("/edit_customer/{id}")
    public String updateCustomer(@PathVariable(value="id") long id, Model model) {
        model.addAttribute("customer", customerService.findCustomerById(id));
        return "register_customer/edit_customer";
    }

    @PostMapping("/edit_customer")
    public String editCustomer(@ModelAttribute CustomerModel customer) {
        customerService.updateCustomer(customer.getId(), customer);
        return "redirect:/";
    }

}
