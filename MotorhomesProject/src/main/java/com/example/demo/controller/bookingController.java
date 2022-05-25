//Authors: team
package com.example.demo.controller;

import com.example.demo.model.BookingModel;
import com.example.demo.service.AccessoryService;
import com.example.demo.service.BookingService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.MotorhomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bookingController {

    //dependency injection to use bookingService class
    @Autowired
    BookingService bookingService;

    //dependency injection to use motorgomeService class
    @Autowired
    MotorhomeService motorhomeService;

    //dependency injection to use customerService class
    @Autowired
    CustomerService customerService;

    //dependency injection to use accessoryService class
    @Autowired
    AccessoryService accessoryService;

//    get the mapping for register booking page
    @GetMapping("/bookings")
    public String registerBooking(Model model) {
        model.addAttribute("customers", customerService.fetchAll());
        model.addAttribute("motorhomes", motorhomeService.fetchAllMotorhome());
        model.addAttribute("accessories", accessoryService.fetchAll());
        model.addAttribute("bookings", bookingService.fetchAll());
        return "bookings/register_booking";
    }

//    from addBooking page - posts the new booking into the model(table)
//    redirects to bookings page
    @PostMapping("/bookings")
    public String addBooking(@ModelAttribute BookingModel booking) {
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }

//    deletes booking via id
    @GetMapping("/delete_booking/{id}")
    public String deleteBooking(@PathVariable("id") long id) {
        boolean deleted = bookingService.deleteBooking(id);
        return "redirect:/bookings";
    }

//    get the mapping for editBooking page
//    returns booking via id
    @GetMapping("/edit_booking/{id}")
    public String updateBooking(@PathVariable("id") long id, Model model) {
        model.addAttribute("booking", bookingService.findBookingById(id));
        return "bookings/edit_booking";
    }

//    from editBooking page - posts the edited booking into the model(table)
//    redirects to booking page
    @PostMapping("/edit_booking")
    public String edit(@ModelAttribute BookingModel booking) {
        bookingService.updateBooking(booking.getId(), booking);
        return "redirect:/bookings";
    }
}

