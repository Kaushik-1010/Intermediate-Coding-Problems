package from13thDay;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindromeString(s))
        {
            System.out.println("It is palindrome String");
        }
        else
        {
            System.out.println("It is not Palindrome String");
        }
    }

    private static boolean isPalindromeString(String s) {
        String sb= new StringBuilder(s).reverse().toString();
        if(s.equals(sb))
        {
            return true;
        }
        else
        {
            return false;
        }


    }
}
