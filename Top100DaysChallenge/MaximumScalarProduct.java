import java.util.Arrays;
import java.util.Scanner;

public class MaximumScalarProduct {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println(maxScalarProd(arr1,arr2,n));
    }

    private static int maxScalarProd(int[] arr1, int[] arr2, int n) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int prod=0;
        for(int i=0;i<n;i++)
        {
            prod+=arr1[i]*arr2[i];
        }
        return prod;
    }
}