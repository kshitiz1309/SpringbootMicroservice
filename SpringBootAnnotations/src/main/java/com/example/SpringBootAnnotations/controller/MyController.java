package com.example.SpringBootAnnotations.controller;

import com.example.SpringBootAnnotations.Beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyController {

    @Autowired
    @Qualifier("Student1")
    private Student student;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Student home(@RequestBody Student st){
        st.studying();
        System.out.println("this is my home");
        this.student.setName("Kshitiz Kumar Srivastava");
        return this.student;
    }

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
    public String user(@PathVariable("userId") Integer userId){
        return String.valueOf(userId);
    }

    @RequestMapping(value = "/user1",method = RequestMethod.GET)
    public String username(@RequestParam(name = "userId") Integer userId){
        return String.valueOf(userId);
    }


}
