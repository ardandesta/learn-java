package com.belajarjava.looping.dowhile;

public class Main {

    public static void main(String[] args) {

/*        do {
            aksi
        } while (kondisi);
*/


        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");
        do {
            a++;
            System.out.println("do while ke-" + a);
            if (a == 12) {
                kondisi = false;
            }
        } while (kondisi);

        System.out.println("akhir program");

    }
}
