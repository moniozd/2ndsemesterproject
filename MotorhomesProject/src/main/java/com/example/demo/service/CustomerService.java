package com.example.demo.service;

import com.example.demo.model.CustomerModel;

import com.example.demo.model.MotorhomeModel;
import com.example.demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    // @Autowired 'creates' an object of the class. This is used to 'connect' the different layers in the application.
    @Autowired
    CustomerRepository customerRepository;

    //Accesses the customer repository's fetchAll, addCustomer, findCustomerById, deleteCustomer and updateCustomer method
    // @Transactional makes it so, it only runs if it completes the whole query
    @Transactional
    public List<CustomerModel> fetchAll() {
        return customerRepository.fetchAll();
    }

    public List<CustomerModel> fetchIdAndName() {
        return customerRepository.fetchIdAndName();
    }


    public CustomerModel addCustomer(CustomerModel customer) {
        return customerRepository.addCustomer(customer);
    }

    public CustomerModel findCustomerById(long id) {
        return customerRepository.findCustomerById(id);
    }

    public Boolean deleteCustomer(long id) {
        return customerRepository.deleteCustomer(id);
    }

    public CustomerModel updateCustomer(long id, CustomerModel customer) {
        return customerRepository.updateCustomer(id, customer);
    }


}
