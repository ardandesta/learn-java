package com.belajarjava.operation.unary;

public class Main {

    public static void main(String[] args){

        //unary : operasi yang dilakukan pada satu variable

        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d \n",angka, -angka);
        System.out.printf("unary '+' %d menjadi %d \n",angka, +angka);

        //unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi =" + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi =" + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '++' menjadi = %d \n", b++);
        System.out.printf("nilai dengan '++' menjadi = %d \n", b);

        //unary boolean dengan ! untuk spasi
        boolean people = true;
        System.out.println("nilai boolean = " + people);
        System.out.println("nilai boolean = " + !people);
    }
}
