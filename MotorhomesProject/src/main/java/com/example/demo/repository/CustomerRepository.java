package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

    public Customer findCustomerById(int id) {
        String sql = "SELECT id, firstName, lastName, email, phoneNumber FROM customers WHERE id = ?;";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        Customer customer = jdbcTemplate.queryForObject(sql, rowMapper);
        return customer;
    }

    public Boolean deleteCustomer(int id) {
        String sql = "DELETE FROM customers WHERE id = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public Customer updateCustomer(int id, Customer customer) {
        String sql = "UPDATE customers SET firstName = ?, lastName = ?, email = ?, phoneNumber = ? WHERE id = ?;";
        jdbcTemplate.update(sql, customer.getId(),customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPhoneNumber());
        return null;
    }

}
