package com.example.demo.service;

import com.example.demo.model.CustomerModel;

import com.example.demo.model.MotorhomeModel;
import com.example.demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerModel> fetchAll() {
        return customerRepository.fetchAll();
    }

    public List<CustomerModel> fetchIdAndName() {
        return customerRepository.fetchIdAndName();
    }


    public CustomerModel addCustomer(CustomerModel customer) {
        return customerRepository.addCustomer(customer);
    }

    public CustomerModel findCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }

    public Boolean deleteCustomer(int id) {
        return customerRepository.deleteCustomer(id);
    }

    public CustomerModel updateCustomer(int id, CustomerModel customer) {
        return customerRepository.updateCustomer(id, customer);
    }


}
