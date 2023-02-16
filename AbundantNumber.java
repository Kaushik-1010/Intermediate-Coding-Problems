package com.Top100Codes;

import java.util.*;
public class AbundantNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        for(int i=1;i<temp;i++)
        {
            if(temp%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>num)
        {
            System.out.println("It is abundant number");
        }
        else
        {
            System.out.println("It is not a abundant number");
        }

    }
}
