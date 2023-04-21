package from13thDay;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(reverseNumber(num));
    }

    private static int reverseNumber(int num) {
        int temp=num;
        int rev=0;
        while(temp>0)
        {
            int d=temp%10;
            rev=(rev*10)+d;
            temp=temp/10;
        }
        return rev;
    }
}
