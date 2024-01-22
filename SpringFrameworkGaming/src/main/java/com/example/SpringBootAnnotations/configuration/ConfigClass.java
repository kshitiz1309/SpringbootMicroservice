package com.example.SpringBootAnnotations.configuration;

import com.example.SpringBootAnnotations.Beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"mypack"})
public class ConfigClass {

    @Bean("Student1")
    @Lazy
    public Student getStudent(){
        System.out.println("Get Student object");
        return new Student("Ram");
    }

    @Bean("Student2")
    @Lazy
    public Student createStudent(){
        System.out.println("Creating Student object");
        return new Student("ram");
    }

    @Bean
    public Date getDate(){
        System.out.println("Creating Date object");
        return new Date();
    }
}
