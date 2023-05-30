import java.util.Scanner;

public class removeDuplicateElementsInArray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter Elements of the Array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s= removeDuplicates(arr,size);
        for(int i=0;i<s;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates(int[] arr, int size) {
        if(size==0 || size==1)
            return 1;
        int j=0;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]!=arr[i+1])
                arr[j++]=arr[i];

        }
        arr[j++]=arr[size-1];
        return j;
    }

}