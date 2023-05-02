package from13thDay;

import java.util.Scanner;

public class CaptializeFirstAndLastLetterOfAString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(captializeFirstAndLastOfString(str));
    }

    private static String captializeFirstAndLastOfString(String str) {
        String [] words=str.split(" ");
        String output=" ";
        for (String word : words) {
            if (word.length() == 1) {
                output = output + word.toUpperCase() + " ";
            } else {
                String modified="";
                for(int j=0;j<word.length();j++)
                {
                    char ch=word.charAt(j);
                    if(j==0 || j==word.length()-1)
                    {
                        ch = Character.toUpperCase(ch);
                    }
                    modified=modified+ch;
                }
                output=output+modified+" ";
            }

            }
        return output.trim();
        }
}
