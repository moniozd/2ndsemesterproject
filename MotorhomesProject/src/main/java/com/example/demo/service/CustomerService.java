package com.example.demo.service;

import com.example.demo.model.Customer;

import com.example.demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> fetchAll() {
        return customerRepository.fetchAll();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

}
