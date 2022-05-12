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

/*    public BookingModel addBooking(BookingModel booking) {
        String sql = "INSERT INTO bookings (customerId, motorhomeId, accessoriesId, startDate, endDate) VALUES (?, ?, ?, ?, ?);";
        System.out.println(booking.getMotorhomeId());
        jdbcTemplate.update(sql, booking.getCustomerId(), booking.getMotorhomeId(), booking.getAccessoriesId(), booking.getStartDate(), booking.getEndDate());
        return null;
    }*/
public BookingModel addBooking(BookingModel booking) {
    System.out.println(booking.getMotorhomeId() + booking.getCustomerId() +
            booking.getAccessoriesId() + booking.getStartDate() + booking.getStartDate());

    jdbcTemplate.update("CALL addBooking(?,?,?,?,?)", booking.getMotorhomeId(), booking.getCustomerId(),
            booking.getAccessoriesId(), booking.getStartDate(), booking.getEndDate());
    return null;
}

    public BookingModel findBookingById() {
        String sql = "SELECT id, customerId, accessoriesId, motorhomeId, startDate, endDate FROM bookings WHERE id = ?;";
        RowMapper<BookingModel> rowMapper = new BeanPropertyRowMapper<>(BookingModel.class);
        BookingModel booking = jdbcTemplate.queryForObject(sql, rowMapper);
        return booking;
    }

    public Boolean deleteBooking(int id) {
        String sql = "DELETE FROM bookings WHERE id = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }

/*    public BookingModel updateBooking(int id, BookingModel booking) {
        String sql = "UPDATE bookings SET price = ?, customerId = ?, accessoriesId = ?, motorhomeId = ?, startDate = ?, endDate = ? WHERE id = ?;";
        jdbcTemplate.update(sql, booking.getId(), booking.getCustomerId(), booking.getAccessoriesId(), booking.getMotorhomeId(),
                booking.getStartDate(), booking.getEndDate());
        return null;
    }*/

}
