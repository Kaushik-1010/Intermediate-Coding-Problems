import java.util.Scanner;

public class SmallestAndLargestElementInArray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Elements in Array");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int smallest=Integer.MIN_VALUE, largest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(smallest<arr[i])
            {
                smallest=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(largest>arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest element in array is "+largest);
        System.out.println("Smallest element in array is "+smallest);

    }

}