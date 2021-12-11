package com.belajarjava.method.fungsirekursif.bercabang;

import java.util.*;
import java.lang.String;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("masukkan nilai n = ");
        Integer nilai = userInput.nextInt();
        Integer nilaiFibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke " + nilai + "adalah = " + nilaiFibonacci);
    }

    private static int fibonacci(Integer n, String daun) {
        System.out.println("daun " + daun);
        System.out.println("fibonacci ke - " + n);
        if (n == 1 || n == 0) {

            return n;
        }
        return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
    }
}
