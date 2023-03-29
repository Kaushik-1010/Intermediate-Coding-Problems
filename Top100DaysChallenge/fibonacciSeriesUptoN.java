package com.Top100DaysChallenge;

import java.util.Scanner;

public class fibonacciSeriesUptoN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        fibonacciSeries(n);
    }

    private static void fibonacciSeries(int n) {
        int num1=0,num2=1;
        System.out.print(num1+ ","+num2);
        for(int i=2;i<n;i++)
        {
            int num3=num1+num2;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
        }
    }
}


/*

USING RECURSION APPROACH

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


 */
