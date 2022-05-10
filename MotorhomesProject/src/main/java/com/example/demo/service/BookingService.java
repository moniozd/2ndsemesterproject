package com.example.demo.service;

import com.example.demo.model.BookingModel;
import com.example.demo.model.CustomerModel;

import com.example.demo.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<BookingModel> fetchAll() {
        return bookingRepository.fetchAll();
    }

    public BookingModel addBooking(BookingModel booking) {
        return bookingRepository.addBooking(booking);
    }

    public BookingModel findBookingById(int id) {
        return bookingRepository.findBookingById();
    }

    public Boolean deleteBooking(int id) {
        return bookingRepository.deleteBooking(id);
    }

    public BookingModel updateBooking(int id, BookingModel booking) {
        return bookingRepository.updateBooking(id, booking);
    }


}
