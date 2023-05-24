package from13thDay;

import java.util.Scanner;

public class ConcatenateString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(concatString(s1,s2));
    }

    private static String concatString(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }
}
