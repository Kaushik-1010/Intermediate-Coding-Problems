package com.Top100DaysChallenge;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(factNum(num));
    }

    private static int factNum(int num) {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}

// USING RECURSION APPROACH//
/*
package com.Top100DaysChallenge;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(factNum(num));
    }

    private static int factNum(int num) {
        if(num==0 || num==1)
            return 1;
        else
            return num*factNum(num-1);
    }
}

 */
