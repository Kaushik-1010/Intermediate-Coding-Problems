import java.util.Arrays;
import java.util.Scanner;

public class MinimumScalarProductOfTwoArrays {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n= sc.nextInt();
        int []arr1= new int[n];
        int []arr2= new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]= sc.nextInt();
        }
        SpecialSort(arr1,n);
        System.out.print(MinimumScalarProduct(arr1,arr2,n));


    }

    private static int MinimumScalarProduct(int[] arr1, int[] arr2, int n) {
        int min,sop=0;
        int id1=0,id2=0;
        for(int i = 0 ; i<n ; i++)
        {
            min = Integer.MAX_VALUE;
            for(int j = i ; j<n ; j++)
            {
                if((arr1[i]*arr2[j]) < min)
                {
                    min = arr1[i]*arr2[j];
                    id1 = i; id2 = j;
                }
            }
            sop = sop + min;
            swap(arr1,i,id1);
            swap(arr2,i,id2);
        }
        return sop;
    }

    private static void SpecialSort(int[] arr1, int n) {
        Arrays.sort(arr1);
        int idx=0;
        while ((idx<n) && (arr1[idx]<0))
        {
            idx++;
        }
        int start = idx,end = n-1;
        while(start<end)
        {
            swap(arr1,start,end);
            start++;end--;
        }
    }
    public static void swap(int arr[],int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}