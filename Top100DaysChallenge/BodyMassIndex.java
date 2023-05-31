import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i =0 ;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int bmi = (arr[i][0] / (arr[i][1] * arr[i][1]));
            if(bmi<= 18)
                System.out.println("1");
            else if( bmi>18 &&bmi< 25)
                System.out.println("2");
            else if(bmi>24 &&bmi<30)
                System.out.println("3");
            else if (bmi>= 30)
                System.out.println("4");
        }
        sc.close();
    }
}