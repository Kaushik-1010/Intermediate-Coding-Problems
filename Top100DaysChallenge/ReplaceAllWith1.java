package from13thDay;

import java.util.Scanner;

public class ReplaceAllWith1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(replaceAllWith1(num));
    }

    private static int replaceAllWith1(int num) {
        String s= Integer.toString(num);
        s=s.replaceAll("0","1");
        return Integer.parseInt(s);
    }
}
