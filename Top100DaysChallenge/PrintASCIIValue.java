package com.Top100DaysChallenge;

import java.util.Scanner;

public class PrintASCIIValue {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(printAsciiValue(str));

    }

    private static int printAsciiValue(String str) {
        for(char ch:str.toCharArray()) {
            if (Character.isAlphabetic(ch))
                return (int)ch;
        }
        return -1;
    }
}
