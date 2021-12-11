package com.belajarjava.method.methodvoid;

public class Main {

    public static void main(String[] args) {

        //void itu artinya hampa
        System.out.println(simple());

        fungsiVoid("everything");

        goodMoorning("Fernando Alonso");
        goodMoorning("Sergio Perez");
        goodMoorning("Charles Lecrerc");

    }

    private static void goodMoorning(String name){

        System.out.println("good moorning " + name);
    }

    //fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    /*fungsi atau  ethod dengan kembalian
      sehinga menggunakan return untuk
      mengembalikan nilainya (10.0f)
     */
    private static float simple(){
        return 100.0f;

    }
}
