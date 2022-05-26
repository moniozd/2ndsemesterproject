//Authors: team
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// @Data handles all boilerplate code like getters, setters etc.
@Data
@Table(name = "customers")
// @Entity is for classes that represent a table in the database
@Entity
public class CustomerModel {

    // @Id is for the primary key for the table
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

}

//    @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(name = "customerId", referencedColumnName = "id")
//    private List<BookingModel> bookingModelList;


/*

    public CustomerModel(int id, String firstName, String lastName, String email, int phoneNumber, List<BookingModel> bookingModelList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bookingModelList = bookingModelList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
*/
