//Authors: team
package com.example.demo.repository;


import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorhomeRepository {


    //    dependency injection of JdbcTemplate to run SQL-queries
    @Autowired
    JdbcTemplate jdbcTemplate;

    //    retrieve everything the from "bookings" table
    public List<MotorhomeModel> fetchAllMotorhome(){
        return jdbcTemplate.query("SELECT * FROM motorhomes;",
                new BeanPropertyRowMapper<>(MotorhomeModel.class));
    }

    // Retrieve name and id from motorhome table
    public List<MotorhomeModel> fetchIdAndName(){
        return jdbcTemplate.query("SELECT id, name FROM motorhomes;",
                new BeanPropertyRowMapper<>(MotorhomeModel.class));
    }

}
