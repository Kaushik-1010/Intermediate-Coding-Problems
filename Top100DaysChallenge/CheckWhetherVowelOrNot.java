package com.Top100DaysChallenge;

import java.util.Scanner;

public class CheckWhetherVowelOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isVowelorNot(str));

    }

    private static String isVowelorNot(String str) {
        str = str.toUpperCase();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                return "Invalid Input";
            }
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return "Vowel";
            }
        }
        return "Consonant";
    }}
