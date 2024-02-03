package com.example.SpringBootAnnotations.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Table(name = "jpa_student")
public class StudentEntity {
    @Id
    private int id;
    private String name;
    private String about;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;
}
