package com.Top100DaysChallenge;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(findSumOfDigits(num));

    }

    private static int findSumOfDigits(int num) {
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int d=temp%10;
            sum+=d;
            temp=temp/10;
        }
        return sum;
    }
}
