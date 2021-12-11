package com.belajarjava.typedata.string.operasi;

import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        String kalimat = "McLaren F1 Team pakai Mesin Mercedes";
        System.out.println(kalimat + "\n");

        //mengambil komponen dari string
        System.out.println("\nMENGAMBIL KOMPONEN STRING ====");

        System.out.println(kalimat.charAt(8));

        //substring
        System.out.println("\nSUBSTRING ====");

        String kata = kalimat.substring(22, 27);
        System.out.println(kata);

        //concatenation (concat)
        System.out.println("\nCONCAT ====");

        String kalimat2 = kata + " Renault";
        System.out.println(kalimat2);

        kata = kata + " Honda";
        System.out.println(kata);

        //concat dengan non string
        System.out.println("\nCONCAT DENGAN NOT STRING ====");

        int tahun = 1998;
        String kalimat3 = kata + " " + tahun;
        System.out.println(kalimat3);
        System.out.println(kata + " " + tahun);

        //lowercase & uppercase
        System.out.println("\nUPPERCASE & LOWERCASE ====");

        System.out.println(kalimat.toUpperCase(Locale.ROOT));
        System.out.println(kalimat.toLowerCase(Locale.ROOT));

        //replace
        System.out.println("\nREPLACE ====");

        String kalimat4 = kalimat.replace("Mercedes", "Renault");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        //compare
        System.out.println("\nCOMPARE ====");

        System.out.println("TEAM");
        String team1 = "Redbull Racing";
        String team2 = "Mercedes Petronas AMG";
        System.out.println(team1.compareTo(team2));
        System.out.println(team2.compareTo(team1));

        System.out.println("TRACK");
        String track1 = "Interlagos";
        String track2 = "Silverstone";
        System.out.println(track1.compareTo(track2));
        System.out.println(track2.compareTo(track1));

        //equality (persamaan)
        System.out.println("\nEQUALITY (PERSAMAAN) ====");
        String kataInput = ("test"); //ini ada di string pool
//        String kataInput = new String("test"); //ini bukan string literal & ini tidak ada di string pool
        String kataTest = "test"; //ini ada juga di string pool

        System.out.println("persamaan pada lokasi string pool");
        if (kataInput == kataTest) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        System.out.println("\nmengambil input string dari user");
        Scanner userInput = new Scanner(System.in);
        kataInput = userInput.next(); //tidak di string pool
        System.out.println("ini adalah input user " + kataInput);

        if (kataInput.equals("test")) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

    }
}
