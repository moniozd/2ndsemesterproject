//Authors: team
package com.example.demo.repository;

import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    //    dependency injection of JdbcTemplate to run SQL-queries
    @Autowired
    JdbcTemplate jdbcTemplate;

    //    retrieve everything from "customers" table
    public List<CustomerModel> fetchAll(){
        return jdbcTemplate.query("SELECT * FROM customers;",
                new BeanPropertyRowMapper<>(CustomerModel.class));
    }

    //    retrieve name and id from "customers" table
    public List<CustomerModel> fetchIdAndName(){
        return jdbcTemplate.query("SELECT id, firstName FROM customers;",
                new BeanPropertyRowMapper<>(CustomerModel.class));
    }

    //    add a new customer with id(auto-increments)
    public CustomerModel addCustomer(CustomerModel customer) {
        String sql = "INSERT INTO customers (firstName, lastName, email, phoneNumber) VALUES (?, ?, ?, ?);";
        jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPhoneNumber());
        return null;
    }

    //  find and show customer information via customer id
    public CustomerModel findCustomerById(long id) {
        String sql = "SELECT * FROM customers WHERE id = ?;";
        RowMapper<CustomerModel> rowMapper = new BeanPropertyRowMapper<>(CustomerModel.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    // Delete a customer via customer id
    public Boolean deleteCustomer(long id) {
        String sql = "DELETE FROM customers WHERE id = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }

    // Find and edit a customer using the customer id
    public CustomerModel updateCustomer(long id, CustomerModel customer) {
        String sql = "UPDATE customers SET firstName = ?, lastName = ?, email = ?, phoneNumber = ? WHERE id = ?;";
        jdbcTemplate.update(sql, customer.getId(),customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPhoneNumber());
        return null;
    }

}
