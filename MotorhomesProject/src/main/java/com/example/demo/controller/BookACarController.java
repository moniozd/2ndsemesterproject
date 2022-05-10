package com.example.demo.controller;


import com.example.demo.model.CustomerModel;
import com.example.demo.model.RentalModel;
import com.example.demo.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookACarController {

    @Autowired
    RentalService rentalService;

    @GetMapping("/book_a_car")
    public String bookACarPage(Model model) {
        return "book_a_car/book_a_car";
    }

    @PostMapping("/book_a_car")
    public String addCustomer(@ModelAttribute RentalModel rentalModel) {
        rentalService.addBooking(rentalModel);
        return "redirect:/book_a_car";
    }

}
