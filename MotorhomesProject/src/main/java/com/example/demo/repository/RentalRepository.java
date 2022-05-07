/*
package com.example.demo.repository;


import com.example.demo.model.RentalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RentalRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public RentalModel addBooking(RentalModel rentalModel) {
        String sql = "INSERT INTO bookings (customer_name, customer_last_name, motor_home_name, " +
                    "customer_phone_number, customer_email) " +
                    "VALUES (?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, rentalModel.getCustomer().getFirstName(),
                                rentalModel.getCustomer().getLastName(),
                                rentalModel.getMotorhome().getMotorhomeTypeModel(),
                                rentalModel.getCustomer().getPhoneNumber(),
                                rentalModel.getCustomer().getEmail());
        return null;
    }

}
*/
