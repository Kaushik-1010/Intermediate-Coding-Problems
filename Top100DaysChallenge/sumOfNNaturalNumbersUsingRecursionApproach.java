package from13thDay;

import java.util.Scanner;

public class sumOfNNaturalNumbersUsingRecursionApproach {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findSumOfNNaturalNumbersUsingRecursion(n));
    }

    private static int findSumOfNNaturalNumbersUsingRecursion(int n) {
        if(n==1)
            return 1;
        else
            return n+ findSumOfNNaturalNumbersUsingRecursion(n-1);
    }
}
