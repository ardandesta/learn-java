package com.belajarjava.oop.setget;

import static com.belajarjava.oop.setget.Student.NAME;

public class Main {

    public static void main(String[] args) {

        Rumah rumah = new Rumah();
        rumah.setKursi("kursi");
        System.out.println(rumah.getKursi());

        Gedung gedung = new Gedung();
        gedung.setLantai("lantai");
        System.out.println(gedung.getLantai());

        Student iyem = new Student();
        iyem.setFirstName("paijo");
        iyem.setLastName("paimen");
        iyem.setAge(12);

        System.out.println(iyem.getFirstName());
        System.out.println(iyem.getLastName());
        System.out.println(iyem.getAge());
        System.out.println(iyem.getFullName());
        System.out.println(iyem.getProfile());
        System.out.println(iyem.address);

        int valueAdd = getAddValue(10,20);
        System.out.println(valueAdd);
        int valueSubstrat = getSubstratValue(5,20);
        System.out.println(valueSubstrat);
        int valueMultiple = getMultipleValue(5,4);
        System.out.println(valueMultiple);
        int valueDivision = getDivisionValue(10,50);
        System.out.println(valueDivision);

        System.out.println(NAME);
    }


    public static Integer getAddValue(int firstValue,int secondValue){
        return getSubstratValue(firstValue,secondValue);
    }
    
    public static Integer getSubstratValue(int firstValue,int secondValue){
        return firstValue - secondValue;
    }
    public static Integer getMultipleValue(int firstValue,int secondValue){
        return firstValue * secondValue;
    }
    public static Integer getDivisionValue(int firstValue,int secondValue){
        return firstValue / secondValue;
    }
}
