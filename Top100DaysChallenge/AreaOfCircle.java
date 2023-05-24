package from13thDay;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(areaOfCircle(n));
    }

    private static double areaOfCircle(int n) {
        double area;
        area=3.14*n*n;
        return area;


    }
}
