package from13thDay;

import java.util.Scanner;

public class sumOfNnaturalNumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findSumOfNNaturalNumbers(n));
    }

    private static int findSumOfNNaturalNumbers(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
