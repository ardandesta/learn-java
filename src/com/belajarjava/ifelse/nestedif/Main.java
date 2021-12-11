package com.belajarjava.ifelse.nestedif;

public class Main {

    public static void main(String[] args) {

/*          if (ekspresi1){

            if (ekspresi2){

                statementaksi;

            }else {

                statementdefault2;

            }

        }else{

            statementdefault1;

        }
*/


        //nested if / if bersarang

        int a = 5;
        int b = 6;

        System.out.println("ini adalah awal program");
        if (a == 5){

            if (b == 10){

                System.out.println("ini adalah aksi, dimana a = 5 dan b = 10");

            } else {

                System.out.println("ini adalah aksi default 2, dimana a = 5 dan b bukan 10");
            }
        } else {

            System.out.println("ini adalah aksi aksi default 1, dimana a dan b salah");
            }

        System.out.println("ini adalah akhir program");
    }
}
