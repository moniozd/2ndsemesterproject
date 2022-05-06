package com.example.demo.repository;

import com.example.demo.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<CustomerModel> fetchAll(){
        return jdbcTemplate.query("SELECT * FROM customers;",
                new BeanPropertyRowMapper<>(CustomerModel.class));
    }
}
