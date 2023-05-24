package from13thDay;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isStrongNum(num));
    }

    private static String isStrongNum(int num) {
        int temp=num;
        int sum=0;
        while(temp>0) {
            int d=temp%10;
            sum+=fact(d);
            temp=temp/10;
        }
        if(sum==num)
            return "Strong Number";
        else
            return "Not A Strong Number";
    }

    private static int fact(int n) {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);

    }
}
