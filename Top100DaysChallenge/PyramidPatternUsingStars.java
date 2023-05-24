package from13thDay;

import java.util.Scanner;

public class PyramidPatternUsingStars {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pyramidPattern(n);
    }
    public static void pyramidPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
         for(int j=n-i;j>1;j--)
         {
             System.out.print(" ");
         }
         for(int j=0;j<=i;j++)
         {
             System.out.print("* ");
         }
         System.out.println();
        }
    }
}
