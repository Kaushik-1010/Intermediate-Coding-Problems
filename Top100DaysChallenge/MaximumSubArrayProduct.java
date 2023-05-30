import java.util.Scanner;

public class MaximumSubArrayProduct {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        maxSubArrProd(arr,n);
    }

    private static void maxSubArrProd(int[] arr, int n) {
        int ans=arr[0];
        for(int i=0;i<n;i++)
        {
            int prod=arr[i];
            for(int j=i+1;j<n;j++)
            {
                ans=Math.max(ans,prod);
                prod=prod*arr[j];
            }
            ans=Math.max(ans,prod);

        }
        System.out.println(ans);
    }
}