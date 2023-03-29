package com.Top100DaysChallenge;

import java.util.Scanner;

public class IdentifyNumberIsPositiveOrNegative {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(positiveOrNegative(n));

    }

    private static String positiveOrNegative(int n) {
        if(n<0)
        {
            return "Negative Number";
        }
        else if(n>0)
        {
            return "Positive Number";
        }
        else {
            return "Neither Negative Nor Positive";
        }
    }
}
