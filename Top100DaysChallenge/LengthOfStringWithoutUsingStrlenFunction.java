package from13thDay;

import java.util.Scanner;

public class LengthOfStringWithoutUsingStrlenFunction {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(lengthWithoutStrlen(s1));
    }

    private static int lengthWithoutStrlen(String s1) {
        int len=0;
        for(char c: s1.toCharArray())
        {
            len++;
        }
        return len;
    }
}
