import java.util.Scanner;

public class NewTablet {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int b= sc.nextInt();
            int n=sc.nextInt();
            int size=0;
            for(int j=0;j<n;i++)
            {
                int w= sc.nextInt();
                int h= sc.nextInt();
                int p=sc.nextInt();
                if(p<=b)
                {
                    if(w*h>size)
                    {
                        size=w*h;
                    }
                }
            }
            if(size!=0)
            {

                System.out.println(size);
            }else {
                System.out.println("no tablet");
            }

        }

    }
}