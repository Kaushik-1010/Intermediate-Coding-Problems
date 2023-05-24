package from13thDay;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(perfectNumber(num));

    }

    private static String perfectNumber(int num) {
        int temp=num;
        int sum=0;
        for(int i=1;i<temp;i++)
        {
            if(temp%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
            return "Perfect Number";
        else
            return "Not a Perfect Number";
    }
}
