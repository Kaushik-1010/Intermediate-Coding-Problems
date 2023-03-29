package com.Top100DaysChallenge;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(evenorOdd(n));
    }

    private static String evenorOdd(int n) {
        if(n%2==0)
        {
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
