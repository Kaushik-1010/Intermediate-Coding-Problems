package from13thDay;

import java.util.Scanner;

public class ToggleEachCharacterInAString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(toggleEachCharacter(s));

    }

    private static String toggleEachCharacter(String s) {
        StringBuilder sb= new StringBuilder();
        for(char c: s.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                sb.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
