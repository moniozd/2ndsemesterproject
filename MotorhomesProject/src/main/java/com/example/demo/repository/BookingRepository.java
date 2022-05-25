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

    // Displays the id and the name with CONCAT
/*    public List<BookingModel> fetchAll(){
        return jdbcTemplate.query("SELECT bookings.id, CONCAT(c.id,'-', c.firstName),CONCAT(m.id,'-',m.name) ,CONCAT(a.id, '-', a.name) , startDate, endDate\n" +
                "FROM bookings\n" +
                "         LEFT JOIN accessories a on a.id = bookings.accessoriesId\n" +
                "LEFT JOIN customers c on c.id = bookings.customerId\n" +
                "LEFT JOIN motorhomes m on m.id = bookings.motorhomeId;",
                new BeanPropertyRowMapper<>(BookingModel.class));
    }*/

    public BookingModel addBooking(BookingModel booking) {
        String sql = "INSERT INTO bookings (motorhome, customer, accessories, start_date, end_date) VALUES (?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, booking.getMotorhome(), booking.getCustomer(), booking.getAccessories(), booking.getStartDate(), booking.getEndDate());
        return null;
    }
/*
public BookingModel addBooking(BookingModel booking) {
    jdbcTemplate.update("CALL addBooking(?,?,?,?,?)", booking.getMotorhome(), booking.getCustomer(),
            booking.getAccessories(), booking.getStartDate(), booking.getEndDate());
    return null;
}
*/

    public BookingModel findBookingById(long id) {
        String sql = "SELECT id, motorhome, customer, accessories, start_date, end_date FROM bookings WHERE id = ?;";
        RowMapper<BookingModel> rowMapper = new BeanPropertyRowMapper<>(BookingModel.class);
        BookingModel booking = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return booking;
    }

    public Boolean deleteBooking(long id) {
        String sql = "DELETE FROM bookings WHERE id = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public BookingModel updateBooking(long id, BookingModel booking) {
        String sql = "UPDATE bookings SET motorhome = ?, customer = ?, accessories = ?,  start_date = ?, end_date = ? WHERE id = ?;";
        jdbcTemplate.update(sql, booking.getId(), booking.getCustomer(), booking.getAccessories(), booking.getMotorhome(),
                booking.getStartDate(), booking.getEndDate());
        return null;
    }

}
