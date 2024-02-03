package com.example.SpringBootAnnotations.repository;

import com.example.SpringBootAnnotations.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {
}
