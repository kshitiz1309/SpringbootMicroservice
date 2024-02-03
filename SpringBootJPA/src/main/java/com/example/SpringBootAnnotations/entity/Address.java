package com.example.SpringBootAnnotations.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "jpa_address")
public class Address {
    @Id
    private int addressId;
    private String city;
    private String country;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    public Address() {
    }

    public Address(int addressId, String city, String country, StudentEntity student) {
        this.addressId = addressId;
        this.city = city;
        this.country = country;
        this.student = student;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }
}
