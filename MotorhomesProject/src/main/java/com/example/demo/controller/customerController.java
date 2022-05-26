//Authors: team
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

    //    dependency injection to use customerService class
    @Autowired
    CustomerService customerService;

//    get the mapping for register customer page
//    @fetchAll - adds customer to the model
    @GetMapping("/register_customer")
    public String registerCustomerPage(Model model) {
        model.addAttribute("customers", customerService.fetchAll());
        return "register_customer/register_customer";
    }

//    from addCustomer page - posts the new customer into the table
//            redirects to register customer page
    @PostMapping("/register_customer")
    public String addCustomer(@ModelAttribute CustomerModel customer) {
        customerService.addCustomer(customer);
        return "redirect:/register_customer";
    }

//    deletes customer via id
    @GetMapping("/delete_customer/{id}")
    public String deleteCustomer(@PathVariable("id") long id) {
        boolean deleted = customerService.deleteCustomer(id);
        return "redirect:/register_customer";
    }

//    get the pagging for edit customer page
//    returns customer via id
    @GetMapping("/edit_customer/{id}")
    public String updateCustomer(@PathVariable(value="id") long id, Model model) {
        model.addAttribute("customer", customerService.findCustomerById(id));
        return "register_customer/edit_customer";
    }

//    from edit customer page - posts the edited customer into the model(table)
//    redirects to register customer page
    @PostMapping("/edit_customer")
    public String editCustomer(@ModelAttribute CustomerModel customer) {
        customerService.updateCustomer(customer.getId(), customer);
        return "redirect:/register_customer";
    }

}
