import java.util.Scanner;

/*
Nejiya has a bucket having a capacity of K liters. It is already filled with X liters of water.

Find the maximum amount of extra water in liters that Nejiya can fill in the bucket without overflowing.

Input Format

The first line will contain T - the number of test cases. Then the test cases follow.

The first and only line of each test case contains two space separated integers K and X - as mentioned in the problem.

Sample Input 1

2

5 4

15 6

Sample Output 1

1

9
 */
public class BucketFilling {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int []c=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        System.out.println(c[i]=a[i]-b[i]); }

    }
}
