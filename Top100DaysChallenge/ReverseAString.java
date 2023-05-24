package from13thDay;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();

    }
}
