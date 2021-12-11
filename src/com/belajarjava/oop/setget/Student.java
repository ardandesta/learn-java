package com.belajarjava.oop.setget;

import com.belajarjava.oop.setget.People;

public class Student extends People {

    public static final String NAME = "Halo";

    private String firstName;
    private String lastName;
    private Integer age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getProfile() {
        return "My Name is " + this.firstName + " " + this.lastName
                + "\nMy age is " + this.age;
    }
}
