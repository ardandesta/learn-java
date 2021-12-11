package com.belajarjava.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Assignment
        // type data [] nama = {komponen-komponennya};

        System.out.println("Assignment Array");

        //           index =  0,1,2,3
        //                    | | | |
        int[] arrayInteger = {1,2,3,4};

        arrayInteger[2] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Deklarasi
        // type data[] nama = new int[jumlah array];

        System.out.println("Deklarasi Array");

        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.3f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println("--------------------");

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
