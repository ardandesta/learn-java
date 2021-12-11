package com.belajarjava.switchcase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //switch case

        String input;

        Scanner inputUser = new Scanner(System.in);
        input = inputUser.next();

        System.out.print("panggil nama ");
        System.out.println(input);

        //ekspresinya berupa satuan (int, long, byte, short), String, atau enun

        switch (input){
            case "hamilton":
                System.out.println("saya hamilton dan saya hadir");
                break;
            case "verstappen":
                System.out.println("saya verstappen dan saya hadir");
                break;
            case "norris":
                System.out.println("saya norris dan saya hadir");
                break;
            default:
                System.out.println(input + "tidak hadir");
        }

        System.out.println("selesai program");
    }
}
