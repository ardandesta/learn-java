package com.belajarjava.typedata.string;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //membuat String

        String kataString = "hello";
        char[] kataChar = {'h', 'e', 'l', 'l', 'o'};

        //menampilkan String

        System.out.println(kataString);
        System.out.println(kataChar);
        System.out.println(Arrays.toString(kataChar));

        //menampilkan komponen dari String
        //itu tidak bisa karena String di Java Immutable

        System.out.println("komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(3));

        //merubah komponen

        kataChar[0] = 'c';
        //kataString[0] = "c";  <--- tidak bisa
        //kataString.charAt[0] = "c";  <-- tidak bisa
        System.out.println(Arrays.toString(kataChar));

        //merubah komponen secara tidak langsung

        printAddress("kataString", kataString);

        kataString = "c" + kataString.substring(1, 5);

        System.out.println(kataString);

        printAddress("kataString", kataString);

        String str_1 = "hello";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);

        str_3 = str_3.substring(0, 4);
        printAddress("str_3", str_3);

        String str_4 = "cello";
        printAddress("str_4", str_4);

        kataString = "cello";
        printAddress("kataString", kataString);

        //1. String di Java bersifat Immutable
        //2. String yang berada di String pool akan Reuseble, memory nya lebih efisien
        //3. membuat String dengan method baru maka akan diletakkan di memory lain bukan di String pool


        String a = new String("hello");
        printAddress("a", a);
    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
