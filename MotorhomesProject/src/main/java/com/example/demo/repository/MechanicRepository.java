package com.example.demo.repository;

import com.example.demo.model.BookingModel;
import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MechanicRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<MotorhomeModel> fetchAll(){
        return jdbcTemplate.query("SELECT * FROM motorhomes WHERE serviceNeeded = 1 OR cleaningNeeded = 1;",
                new BeanPropertyRowMapper<>(MotorhomeModel.class));
    }

    public CustomerModel updateService(long id, MotorhomeModel motorhomeModel) {
        String sql = "UPDATE motorhomes SET cleaningNeeded = 0, serviceNeeded = 0 WHERE id = ?;";
        jdbcTemplate.update(sql, motorhomeModel.isCleaningNeeded(), motorhomeModel.isServiceNeeded());
        return null;
    }

    public MotorhomeModel findMotorhomeById(long id) {
        String sql = "SELECT * FROM motorhomes WHERE id = ?;";
        RowMapper<MotorhomeModel> rowMapper = new BeanPropertyRowMapper<>(MotorhomeModel.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

}
