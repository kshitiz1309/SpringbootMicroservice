package com.example.SpringBootAnnotations.Beans;

public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void studying(){
        System.out.println(name+" is Studying");
    }


}
