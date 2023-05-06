

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNot {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        boolean result =anagramOrNot(str1,str2);
        if(result)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }

    private static boolean anagramOrNot(String str1, String str2) {
        if(str1.length() != str2.length())
        {
            return false;
        }
        char[] str1arr=str1.toCharArray();
        char[] str2arr=str2.toCharArray();
        boolean flag=true;
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        return Arrays.equals(str1arr,str2arr);

    }
}
