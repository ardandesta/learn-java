package com.belajarjava.method.fungsi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        Integer inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        Integer inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

        System.out.println("luas = " + luas(inputPanjang, inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang, inputLebar));

        tampilkanKelilingDanLuas(inputPanjang,inputLebar);
    }

    private static void tampilkanKelilingDanLuas(Integer panjang, Integer lebar) {
        System.out.println("luas = " + luas(panjang, lebar));
        System.out.println("keliling = " + keliling(panjang, lebar));
    }

    private static Integer keliling(Integer panjang, Integer lebar) {
        Integer hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static Integer luas(Integer pajang, Integer lebar) {
        Integer hasil = pajang * lebar;
        return hasil;
    }

    private static void gambar(Integer panjang, Integer lebar) {
        for (Integer i = 0; i < lebar; i++) {
            for (Integer j = 0; j < panjang; j++) {
                System.out.print("* ");

            }
            System.out.print("\n");
        }
    }

}
