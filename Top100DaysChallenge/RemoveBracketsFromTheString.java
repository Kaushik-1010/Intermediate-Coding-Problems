package from13thDay;

import java.util.Scanner;

public class RemoveBracketsFromTheString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeBracketsFromString(s));
    }

    private static String removeBracketsFromString(String s) {
        String newstr=s.replaceAll("[{} ()]","");
        return newstr;
    }
}
