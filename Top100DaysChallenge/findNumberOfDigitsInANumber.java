package com.Top100DaysChallenge;

import java.util.Scanner;

public class findNumberOfDigitsInANumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(numberOfDigits(num));

    }

    private static int numberOfDigits(int num) {
        int temp=num;
        int count=0;
        while(temp>0)
        {
            int d=temp%10;
            count++;
            temp=temp/10;
        }
        return count;
    }
}
