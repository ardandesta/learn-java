package com.belajarjava.method.overload;

public class Main {

    public static void main(String[] args) {

        Integer hasilInteger;
        hasilInteger = tambah(4, 5);
        printAngka(hasilInteger);

        Float hasilFloat;


        hasilFloat = tambah(4.5f, 4f);

        printAngka(10);
        printAngka(10.5f);
        printAngka(16.7);
        printAngka(16);

    }
 private static float tambah(Float angkaFloat1, Float angkaFloat2) {
        return angkaFloat1 + angkaFloat2;
    }

    private static Integer tambah(Integer angkaInteger1, Integer angkaInteger2) {
        return angkaInteger1 + angkaInteger2;
    }

    private static void printAngka(Double angkaDouble) {
        System.out.println("Angka ini adalah Double dari nilai = " + angkaDouble);
    }

    private static void printAngka(Float angkaFloat) {
        System.out.println("Angka ini adalah Float dari nilai = " + angkaFloat);
    }

    private static void printAngka(Integer angkaInteger) {
        System.out.println("Angka ini adalah Integer dari nilai = " + angkaInteger);
    }
}
