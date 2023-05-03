package from13thDay;

import java.util.Scanner;

public class NonRepeatingCharactersInAString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        nonRepeatingCharacters(str);
    }

    private static void nonRepeatingCharacters(String str) {
        for(int i=0;i<str.length();i++)
        {
            boolean flag=true;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j && str.charAt(i)==str.charAt(j))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(str.charAt(i)+"");
            }
        }
    }
}
