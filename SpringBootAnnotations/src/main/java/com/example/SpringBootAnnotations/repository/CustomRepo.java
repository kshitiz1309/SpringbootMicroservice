package com.example.SpringBootAnnotations.repository;

import com.example.SpringBootAnnotations.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepo extends JpaRepository<StudentEntity,Integer> {
}
