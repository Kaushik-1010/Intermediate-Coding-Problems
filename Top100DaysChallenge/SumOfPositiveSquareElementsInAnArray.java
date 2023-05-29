import java.util.Scanner;

public class SumOfPositiveSquareElementsInAnArray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();

        }
        System.out.println(sumOfPositiveSquareElementsInArray(arr,n));
    }

    private static int sumOfPositiveSquareElementsInArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i] * arr[i];
            }
        }
        return sum;
    }}
