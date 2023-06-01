import java.util.Scanner;

public class NumbersOfArrayBeEqual {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        numbersOfArrayBeEqual(arr,n);

    }
    private static void numbersOfArrayBeEqual(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            while (arr[i] % 2 == 0)
                arr[i] /= 2;
            while (arr[i] % 3 == 0)
                arr[i] /= 3;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                System.out.println("No");
                return; // exit the method since the arrays are not equal
            }
        }

        System.out.println("Yes");
    }



}
