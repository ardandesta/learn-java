package com.belajarjava.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*jika bisa dibagi 3 = fizz
          jika bisa dibagi 5 = buzz
          jika bisa dibagi 3 & 5 = fizzbuzz
         */

        Scanner userInput = new Scanner(System.in);

        Integer value;
        value = userInput.nextInt();

        if (value < 3){
            System.out.println(value);
        } else if (value % 3 == 0 && value % 5 == 0){
            System.out.println("fizzbuzz");
        } else if (value % 3 == 0){
            System.out.println("fizz");
        } else if (value % 5 == 0){
            System.out.println("buzz");
        } else {
            System.out.println(value);
        }
    }
}
