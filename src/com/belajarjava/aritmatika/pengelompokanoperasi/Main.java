package com.belajarjava.aritmatika.pengelompokanoperasi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //perkalian & pembagian akan dieksekusi terlebih dahulu dari pertambahan & pengurangan
        //tanda ( ) akan dieksekusi terlebih dahulu dari perkalian & pembagian

        int hasil = 10 / 2 + 2 * 5;
        System.out.println(hasil);

        hasil = 12 / (1 + 3);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat

        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradien m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("nilai y = " + y);
    }
}
