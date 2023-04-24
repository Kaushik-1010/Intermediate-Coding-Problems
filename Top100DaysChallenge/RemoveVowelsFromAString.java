package from13thDay;

import java.util.Scanner;

public class RemoveVowelsFromAString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(removeVowel(s));

    }

    private static String removeVowel(String s) {
        String s2= s.replaceAll("[AEIOUaeiou]","");
        return s2;

    }
    }

