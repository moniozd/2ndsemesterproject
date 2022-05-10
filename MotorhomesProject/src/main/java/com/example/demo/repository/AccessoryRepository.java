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

    public List<AccessoryModel> fetchAllAccessories(){
        return jdbcTemplate.query("SELECT * FROM accessories;",
                new BeanPropertyRowMapper<>(AccessoryModel.class));
    }

    public List<AccessoryModel> fetchIdAndName(){
        return jdbcTemplate.query("SELECT id, name FROM accessories;",
                new BeanPropertyRowMapper<>(AccessoryModel.class));
    }

}
