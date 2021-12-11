package com.belajarjava.interfaces;

public class Main {

    public static void main(String[] args) {
        Profile profile = new People();
        profile.getName();
        profile.getAddress();
        profile = new Student();
        profile.getName();
        profile.getAddress();
    }
}
