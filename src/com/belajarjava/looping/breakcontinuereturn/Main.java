package com.belajarjava.looping.breakcontinuereturn;

public class Main {

    public static void main(String[] args) {

        //break continue return

        int a = 0;

        while (true) {
            a++;

            if (a == 10) {
                break; //keyword untuk memaksa keluar dari loop
            } else if (a == 5) {
                continue; //keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7) {
                return;
            }

            System.out.println("looping ke - " + a);
        }

        System.out.println("akhir dari looping");

    }
}
