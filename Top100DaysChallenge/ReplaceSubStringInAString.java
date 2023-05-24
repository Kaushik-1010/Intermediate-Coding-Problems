import java.util.Scanner;

public class ReplaceSubStringInAString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String str=sc.nextLine();
        System.out.println("Enter the substring to be removed :");
        String oldStr=sc.nextLine();
        System.out.println("Enter the new substring :");
        String subStr=sc.nextLine();
        System.out.println(replaceSubStringInAString(str,oldStr,subStr));
    }

    private static String replaceSubStringInAString(String str, String oldStr, String subStr) {
        String newStr= str.replace(oldStr,subStr);
        return newStr;
    }
}