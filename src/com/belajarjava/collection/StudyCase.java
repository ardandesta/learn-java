package com.belajarjava.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudyCase {

    public static void main(String[] args) {
        boolean condition = true;
        String input;
        Set<String> inventory = new HashSet<String>();
        do {
            Scanner userInput = new Scanner(System.in);
            input = userInput.next();
            inventory.add(input);
            if (input == "stop") {
            }
            System.out.println(inventory);
        } while (condition);
    }
}
