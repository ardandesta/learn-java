package com.belajarjava.interfaces;

public class Student implements Profile {

    @Override
    public void getName() {
        System.out.println("ardan");
    }

    @Override
    public void getAddress() {
        System.out.println("gemawang");
    }
}
