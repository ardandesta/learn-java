package com.belajarjava.method.fungsirekursif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        Integer nilai = userInput.nextInt();
        System.out.println("anda memasukkan nilai = " + nilai);

        printNilai(nilai);
        Integer jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        Integer faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);

        // fungsi rekursif sederhana

    }

    public static Integer hitungFaktorial(Integer parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 1) {
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }


    public static Integer jumlahNilai(Integer parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    public static void printNilai(Integer parameter) {

        System.out.println("nilai = " + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;
        printNilai(parameter);
    }
}
