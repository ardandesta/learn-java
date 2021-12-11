package com.belajarjava.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> animalList = new ArrayList<>();
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("bear");
        animalList.add("bird");
        animalList.add("wolf");

        System.out.println(animalList);

        List<String> fruitList = new LinkedList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("watermelon");
        fruitList.add("strawberry");

        System.out.println(fruitList);

        // TODO: perbedaan linkedlist & arraylist, kapan harus ,memakai linkedlist & kapan harus memakai arraylist

        /*
        * Garapan.
        * 1. Bikin implementasi Set
        * 2. Bikin implementasi Map
        *
        * studi kasus.
        * 1. bikin program input nama orang.
        * 2. setelah di input akan di tampilkan,
        * 3. input ulang, dan ditampilkan lagi, terus menerus.
        *
        * contoh:
        * input: arga
        * output: arga
        *
        * input: hisam
        * output: arga, hisam
        *
        * input: fatih:
        * output: arga, hisyam, fatih.
        *
        * kisi2, looping, list.
        * */


        //Set
        System.out.println("\nSet =======");

        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Norris");
        hashSet.add("Gasly");
        hashSet.add("Tsunoda");
        hashSet.add("Perez");
        hashSet.add("Mazepin");

        System.out.println(hashSet);


        //Map
        System.out.println("\nMap =======");

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(33, "Verstappen");
        hashMap.put(44, "Hamilton");
        hashMap.put(63, "Russel");
        hashMap.put(88, "Bottas");

        System.out.println(hashMap);




    }
}
