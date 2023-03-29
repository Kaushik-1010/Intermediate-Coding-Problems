package com.Top100DaysChallenge;

import java.util.Scanner;
import java.io.*;

public class rootsOfQuadraticEquation {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(rootsofQuadratic(a,b,c));


    }

    private static double rootsofQuadratic(double a, double b, double c) {
        double d=Math.pow(b,2)-4*a*c;
        if(d > 0){
            System.out.println("There are two real roots");
            System.out.println("Roots are " + (-b+Math.sqrt(d))/(2*a) + " and " + (-b-Math.sqrt(d))/(2*a));
        }
        else if (d == 0){
            System.out.println("Roots are equal");
            System.out.println("Roots are " + -b/(2*a));
        }
        else {
            System.out.println("No real roots");
            System.out.println("Roots are " + -b / (2 * a) + "+i" +
                    Math.sqrt(-d) / (2 * a) + " and "
                    + -b / (2 * a) + "-i" + Math.sqrt(-d) / (2 * a));
        }
        return 0;

    }
}
