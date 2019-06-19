package com.company;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.print("What phrase would you like to check? ");
        String original = in.nextLine();
        String phrase = original.toLowerCase();

        String backwards = "";

        for (int i = phrase.length() - 1; i >= 0; i--) {
            String letter = phrase.substring(i, i + 1);
            backwards += letter;
        }

        if (phrase.equals(backwards)) {
            System.out.println(original + " is a palindrome!");
        } else {
            System.out.println(original + " is not a palindrome!");
        }

    }
}