package com.example.demo.controller;


import com.example.demo.model.AccessoryModel;
import com.example.demo.model.BookingModel;
import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import com.example.demo.service.AccessoryService;
import com.example.demo.service.BookingService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.MotorhomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookACarController {

    @Autowired
    BookingService bookingService;

    @Autowired
    CustomerService customerService;

    @Autowired
    MotorhomeService motorhomeService;

    @Autowired
    AccessoryService accessoryService;

    @GetMapping("/book_a_car")
    public String bookACarPage(Model model) {
        model.addAttribute("bookings", bookingService.fetchAll());
        model.addAttribute("customers", customerService.fetchAll());
        model.addAttribute("motorhomes", motorhomeService.fetchAllMotorhome());
        model.addAttribute("accessories", accessoryService.fetchAll());
        return "book_a_car/book_a_car";
    }

    @PostMapping("/book_a_car")
    public String addBookACar(@ModelAttribute BookingModel bookingModel) {
        bookingService.addBooking(bookingModel);
        return "redirect:/book_a_car";
    }

}
