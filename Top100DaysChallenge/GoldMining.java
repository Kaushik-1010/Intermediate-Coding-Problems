import java.util.Scanner;

public class GoldMining {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            if((n+1)*y>x)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}