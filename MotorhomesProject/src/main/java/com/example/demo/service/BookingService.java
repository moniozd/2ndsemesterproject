package com.example.demo.service;

import com.example.demo.model.BookingModel;
import com.example.demo.model.CustomerModel;

import com.example.demo.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookingService {

    // @Autowired 'creates' an object of the class. This is used to 'connect' the different layers in the application.
    @Autowired
    BookingRepository bookingRepository;

    //Accesses the accessory repository's fetchAll, addBooking, findBookingById, deleteBooking and updateBooking method
    // @Transactional makes it so, it only runs if it completes the whole query
    @Transactional
    public List<BookingModel> fetchAll() {
        return bookingRepository.fetchAll();
    }

    public BookingModel addBooking(BookingModel booking) {
        return bookingRepository.addBooking(booking);
    }

    public BookingModel findBookingById(long id) {
        return bookingRepository.findBookingById(id);
    }

    public Boolean deleteBooking(long id) {
        return bookingRepository.deleteBooking(id);
    }

    public BookingModel updateBooking(long id, BookingModel booking) {
        return bookingRepository.updateBooking(id, booking);
    }

/*    public BookingModel updateBooking(int id, BookingModel booking) {
        return bookingRepository.updateBooking(id, booking);
    }*/


}
