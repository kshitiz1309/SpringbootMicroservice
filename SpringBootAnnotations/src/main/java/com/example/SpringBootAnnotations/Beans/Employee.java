package com.example.SpringBootAnnotations.Beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public void working(){
        System.out.println("Employee is working");
    }
}
