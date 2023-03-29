package com.Top100DaysChallenge;

import java.util.Scanner;

public class CheckWhetherItIsAnAlphabetOrNot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(isAlphabetOrNot(str));

    }

    private static String isAlphabetOrNot(String str) {
        str=str.toUpperCase();
        for(char ch: str.toCharArray())
        {
            if(Character.isAlphabetic(ch))
            {
                return "Alphabet";
            }
        }
        return "Not an Alphabet";

    }
}
