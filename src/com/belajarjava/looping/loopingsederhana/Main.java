package com.belajarjava.looping.loopingsederhana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //program untuk menjumlahkan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();


        //menggunalan while loop

        total = 0;

        while (nilaiAwal <= nilaiAkhir){

            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        //menggunakan do while

/*
        do {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }while (nilaiAwal <= nilaiAkhir);



        //menggunakan for loop

            total = total + nilaiAwal;

            for (;nilaiAwal<=nilaiAkhir;nilaiAwal++){

                total = total + nilaiAwal;
                System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            }


 */
    }
}
