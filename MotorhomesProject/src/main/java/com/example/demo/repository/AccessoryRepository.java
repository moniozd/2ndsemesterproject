//Authors: team
package com.example.demo.repository;


import com.example.demo.model.AccessoryModel;
import com.example.demo.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccessoryRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    // Calls the database via the JdbcTemplate and uses a Select statement to display everything from the accessories table
    public List<AccessoryModel> fetchAllAccessories(){
        return jdbcTemplate.query("SELECT * FROM accessories;",
                new BeanPropertyRowMapper<>(AccessoryModel.class));
    }

    // Calls the database via the JdbcTemplate and uses a Select statement to display id and name from the accessories table
    public List<AccessoryModel> fetchIdAndName(){
        return jdbcTemplate.query("SELECT id, name FROM accessories;",
                new BeanPropertyRowMapper<>(AccessoryModel.class));
    }

}
