package com.belajarjava.method;

public class Main {

    public static void main(String[] args) {

        //y = (x + 2) * x

        int y, x;
        x = 5;
        y = hitung(x);

        System.out.println("x = " + x + y + ", y = " + y);


    }

    static int hitung(int input) {
        int hasil;

        hasil = (input + 2) * input;

        return hasil;
    }
}
