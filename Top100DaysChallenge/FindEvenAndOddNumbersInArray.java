import java.util.Scanner;

public class FindEvenAndOddNumbersInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int even = 0, odd = 0;
        for(int i=0; i<n; i++){
            if((arr[i] % 2 )== 0)
                even += 1;
            else
                odd += 1;
        }
        System.out.println("Number of even elements: "+ even);
        System.out.println("Number of odd elements: "+ odd);
    }
}