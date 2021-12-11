package com.belajarjava.interfaces;

public class People implements Profile {
    @Override
    public void getName() {
        System.out.println("aksa");
    }

    @Override
    public void getAddress() {
        System.out.println("cirebon");
    }
}
