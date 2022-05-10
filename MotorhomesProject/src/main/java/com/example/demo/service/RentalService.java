package com.example.demo.service;

import com.example.demo.model.RentalModel;
import com.example.demo.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    @Autowired
    RentalRepository rentalRepository;

    public RentalModel addBooking(RentalModel rentalModel) {
        return rentalRepository.addBooking(rentalModel);
    }


}
