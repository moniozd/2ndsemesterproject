package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Customer> fetchAll(){
        return jdbcTemplate.query("SELECT * FROM customers;",
                new BeanPropertyRowMapper<>(Customer.class));
    }

    public Customer addCustomer(Customer customer) {
        String sql = "INSERT INTO customers (firstName, lastName, email, phoneNumber) VALUES (?, ?, ?, ?);";
        jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPhoneNumber());
        return null;
    }

}
