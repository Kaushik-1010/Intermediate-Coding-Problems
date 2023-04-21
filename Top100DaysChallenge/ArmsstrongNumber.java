package from13thDay;

import java.util.Scanner;

public class ArmsstrongNumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        ArmstrongNumber(num);
    }

    private static void ArmstrongNumber(int num) {
        int temp=num;
        int noOfDigits=0;
        int sum=0;
        while(temp>0)
        {
            temp=temp/10;
            ++noOfDigits;
        }
        temp=num;
        while(temp>0)
        {
            int remainder=temp%10;
            sum+=Math.pow(remainder,noOfDigits);
            temp=temp/10;

        }
        if(sum==num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
