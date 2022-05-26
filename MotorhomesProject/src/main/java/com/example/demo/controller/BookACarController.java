//Authors: team
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

    //dependency injection to use bookingService class
    @Autowired
    BookingService bookingService;

    //dependency injection to use customerService class
    @Autowired
    CustomerService customerService;

    //dependency injection to use motorhomeService class
    @Autowired
    MotorhomeService motorhomeService;

    //dependency injection to use accessoryService class
    @Autowired
    AccessoryService accessoryService;

//    get the mapping for book a car page
//    @fetchall - displays the information from the tables
    @GetMapping("/book_a_car")
    public String bookACarPage(Model model) {
        model.addAttribute("bookings", bookingService.fetchAll());
        model.addAttribute("customers", customerService.fetchAll());
        model.addAttribute("motorhomes", motorhomeService.fetchAllMotorhome());
        model.addAttribute("accessories", accessoryService.fetchAll());
        return "book_a_car/book_a_car";
    }

//    from book a car page - posts the new booking into the table
    @PostMapping("/book_a_car")
    public String addBookACar(@ModelAttribute BookingModel bookingModel) {
        bookingService.addBooking(bookingModel);
        return "redirect:/bookings";
    }

}
