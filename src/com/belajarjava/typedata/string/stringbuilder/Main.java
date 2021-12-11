package com.belajarjava.typedata.string.stringbuilder;

import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Welcome to ");
        printData(builder);

        //append
        System.out.println("\nAPPEND ====");

        builder.append("Albert Park");
        printData(builder);

        System.out.println("\n");

        builder.append(", Australia");
        printData(builder);

        //insert
        System.out.println("\nINSERT ====");

        builder.insert(23, " Formula 1 Grand Prix");
        printData(builder);

        //delete
        System.out.println("\nDELETE ====");

        builder.delete(23, 33);
        printData(builder);

        //merubah character index tertentu
        System.out.println("\nMERUBAH CHARACTER INDEX TERTENTU ====");

        builder.setCharAt(22, '_');
        printData(builder);

        //replace
        System.out.println("\nREPLACE ====");

        builder.replace(24, 34, "GPx");
        printData(builder);

        //casting menjadi string
        System.out.println("\nCASTING MENJADI STRING");

        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
    }

    private static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));

    }
}
