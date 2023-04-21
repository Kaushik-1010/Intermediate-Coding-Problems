package from13thDay;

import java.util.Scanner;

public class MaximumNumberOfHandshakes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(maxHandshakes(n));
    }

    private static int maxHandshakes(int n) {
        return (n*(n-1)/2);

    }
}
