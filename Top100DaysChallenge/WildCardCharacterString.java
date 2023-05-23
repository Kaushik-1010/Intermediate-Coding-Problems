import java.util.Scanner;

public class WildCardCharacterString {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        test(s1,s2);
    }
    public static void test(String s1,String s2)
    {
        if(match(s1,s2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean match(String s1,String s2)
    {
        if(s1.length()==0 && s2.length()==0)
        {
            return true;
        }
        if (s1.length() > 1 && s1.charAt(0) == '*') {
            int i=0;
            while (i+1<s1.length() && s1.charAt(i+1) == '*')
                i++;
            s1=s1.substring(i);
        }
        if (s1.length() > 1 && s1.charAt(0) == '*' &&
                s2.length() == 0)
            return false;
        if ((s1.length() > 1 && s1.charAt(0) == '?') ||
                (s1.length() != 0 && s2.length() != 0 &&
                        s1.charAt(0) == s2.charAt(0)))
            return match(s1.substring(1),
                    s2.substring(1));
        if (s1.length() > 0 && s1.charAt(0) == '*')
            return match(s1.substring(1), s2) ||
                    match(s1, s2.substring(1));
        return false;
    }
}