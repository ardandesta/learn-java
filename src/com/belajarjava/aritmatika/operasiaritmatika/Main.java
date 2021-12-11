package com.belajarjava.aritmatika.operasiaritmatika;

public class Main {

    public static void main(String[] args){

        //operasi aritmatika

        int variable1 = 12;
        int variable2 = 5;

        int hasil;

        //penjumlahan
        hasil = variable1 + variable2;
        System.out.println(hasil);
        System.out.printf(" %d + %d = %d \n",variable1,variable2,hasil);

        //pengurangan
        hasil = variable1 - variable2;
        System.out.println(hasil);
        System.out.printf(" %d - %d = %d \n",variable1,variable2,hasil);

        //perkalian
        hasil = variable1 * variable2;
        System.out.println(hasil);
        System.out.printf(" %d * %d = %d \n",variable1,variable2,hasil);

        //pembagian
        hasil = variable1 / variable2;
        System.out.println(hasil);
        System.out.printf(" %d / %d = %d \n",variable1,variable2,hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        //modulus (sisa pembagian)
        hasil = variable1 % variable2;
        System.out.println(hasil);
        System.out.printf(" %d %% %d = %d \n",variable1,variable2,hasil);


    }
}
