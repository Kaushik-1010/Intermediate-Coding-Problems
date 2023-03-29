package com.Top100DaysChallenge;

import java.util.Scanner;

public class FindQuadrants {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(findQuadrants(n1,n2));
    }

    private static String findQuadrants(int n1, int n2) {
        if(n1>0 && n2>0)
            return "First Quadrant";
        else if(n1<0 && n2>0)
            return "Second Quadrant";
        else if(n1>0 && n2<0 )
            return "Third Quadrant";
        else
            return "Fourth Quadrant";
    }
}
