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


    @Autowired
    BookingService bookingService;

    @Autowired
    MotorhomeService motorhomeService;

    @Autowired
    CustomerService customerService;

    @Autowired
    AccessoryService accessoryService;

    @GetMapping("/bookings")
    public String registerBooking(Model model) {
        model.addAttribute("customers", customerService.fetchAll());
        model.addAttribute("motorhomes", motorhomeService.fetchAllMotorhome());
        model.addAttribute("accessories", accessoryService.fetchAll());
        model.addAttribute("bookings", bookingService.fetchAll());
        return "bookings/register_booking";
    }

    @PostMapping("/bookings")
    public String addBooking(@ModelAttribute BookingModel booking) {
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }

    @GetMapping("/delete_booking/{id}")
    public String deleteBooking(@PathVariable("id") long id) {
        boolean deleted = bookingService.deleteBooking(id);
        return "redirect:/bookings";
    }

    @GetMapping("/edit_booking/{id}")
    public String updateBooking(@PathVariable("id") long id, Model model) {
        model.addAttribute("booking", bookingService.findBookingById(id));
        return "bookings/edit_booking";
    }

    @PostMapping("/edit_booking")
    public String edit(@ModelAttribute BookingModel booking) {
        bookingService.updateBooking(booking.getId(), booking);
        return "redirect:/";
    }
}

