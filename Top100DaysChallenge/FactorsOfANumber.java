package from13thDay;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        factorOfNumber(num);
    }

    private static void factorOfNumber(int num) {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
