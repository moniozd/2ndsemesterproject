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
        String sql = "INSERT INTO bookings (price, customer_id, motorhome_id, startDate, accessories_id, endDate) " +
                    "VALUES (?, ?, ?, ?, ?. ?);";
        jdbcTemplate.update(sql, rentalModel.getPrice(), rentalModel.getCustomerId(),
                            rentalModel.getMotorhomeId(), rentalModel.getStartDate(),
                            rentalModel.getAccessoriesId(), rentalModel.getEndDate());
        return null;
    }

}
