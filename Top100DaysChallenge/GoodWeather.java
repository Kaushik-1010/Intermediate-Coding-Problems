import java.util.Scanner;

public class GoodWeather {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int sum1=0,sum2=0;
            for(int j=0;j<7;j++)
            {
                int k=sc.nextInt();
                if(k==1)
                    sum2++;
                else
                    sum1++;

            }
            if(sum1>sum2)
                System.out.println("No");
            else
                System.out.println("Yes");

        }
    }
}