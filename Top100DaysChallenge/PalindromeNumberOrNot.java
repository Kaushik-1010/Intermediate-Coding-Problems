package from13thDay;

import java.util.Scanner;

public class PalindromeNumberOrNot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(isPalindrome(num))
            System.out.println("It is a Palindrome Number");
        else
            System.out.println("It is Not A Palindrome Number");
    }

    private static boolean isPalindrome(int num) {
        int temp=num;
        int rev=0;
        while(temp>0)
        {
            int d=temp%10;
            rev=(rev*10)+d;
            temp=temp/10;
        }
        if(rev==num)
            return true;
        else
            return false;
    }
}
