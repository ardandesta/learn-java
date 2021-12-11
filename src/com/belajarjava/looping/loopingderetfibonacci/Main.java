package com.belajarjava.looping.loopingderetfibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }


        //jika menggunakan while loop

/*        int a = 0;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        while (a <= n){
            System.out.println("nilai ke - " + a + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            a++;
        }


        //menggunakan do while

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        int b = 1;

        do {
            System.out.println("nilai ke - " + b + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            b++;
        }


 */
    }
}
