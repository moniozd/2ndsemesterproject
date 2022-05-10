package com.example.demo.repository;

import com.example.demo.model.BookingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<BookingModel> fetchAll(){
        return jdbcTemplate.query("SELECT * FROM bookings;",
                new BeanPropertyRowMapper<>(BookingModel.class));
    }

    public BookingModel addBooking(BookingModel booking) {
        String sql = "INSERT INTO bookings (id, price, customer_id, accessories_id, motorhome_id, startDate, endDate) VALUES (?, ?, ?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, booking.getId(), booking.getPrice(), booking.getCustomerId(), booking.getAccessoriesId(), booking.getMotorhomeId(), booking.getStartDate(), booking.getEndDate());
        return null;
    }

    public BookingModel findBookingById() {
        String sql = "SELECT id, price, customer_id, accessories_id, motorhome_id, startDate, endDate FROM bookings WHERE id = ?;";
        RowMapper<BookingModel> rowMapper = new BeanPropertyRowMapper<>(BookingModel.class);
        BookingModel booking = jdbcTemplate.queryForObject(sql, rowMapper);
        return booking;
    }

    public Boolean deleteBooking(int id) {
        String sql = "DELETE FROM bookings WHERE id = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public BookingModel updateBooking(int id, BookingModel booking) {
        String sql = "UPDATE customers SET price = ?, customer_id = ?, accessories_id = ?, motorhome_id = ?, startDate = ?, endDate = ? WHERE id = ?;";
        jdbcTemplate.update(sql, booking.getId(),booking.getPrice(), booking.getCustomerId(), booking.getAccessoriesId(), booking.getMotorhomeId(),
                booking.getStartDate(), booking.getEndDate());
        return null;
    }

}
