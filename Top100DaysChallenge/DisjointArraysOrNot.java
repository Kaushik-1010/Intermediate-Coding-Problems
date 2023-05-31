import java.util.Scanner;

public class DisjointArraysOrNot {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n1= sc.nextInt();
        int [] arr1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array");
        int n2=sc.nextInt();
        int [] arr2=new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        disjointArrayOrNot(arr1,n1,arr2,n2);
    }
    public static void disjointArrayOrNot(int[] arr1, int n1, int[] arr2, int n2) {
        boolean commonElementFound = false;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    commonElementFound = true;
                    break;
                }
            }
            if (commonElementFound) {
                break;
            }
        }
        if (commonElementFound) {
            System.out.println("Not disjointed");
        } else {
            System.out.println("Disjointed");
        }
    }
    }
