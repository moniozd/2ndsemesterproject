package com.example.demo.service;

import com.example.demo.model.CustomerModel;
import com.example.demo.model.RentalModel;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerModel> fetchAll() {
        return customerRepository.fetchAll();
    }

}
