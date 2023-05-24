package from13thDay;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(isPrime(num))
            System.out.println("It is a Prime Number");
        else
            System.out.println("It is not a Prime Number");
    }

    private static boolean isPrime(int num) {
        if(num<=1)
            return false;
        if(num==2 || num==3)
            return true;
        if(num%2==0)
            return false;
        int limit=(int)Math.sqrt(num);
        for(int i=5;i<=limit;i=i+2)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
