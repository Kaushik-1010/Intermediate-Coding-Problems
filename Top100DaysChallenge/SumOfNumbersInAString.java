package from13thDay;

import java.util.Scanner;

public class SumOfNumbersInAString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sumOfNumbersInAString(str));

    }

    private static int sumOfNumbersInAString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }

        return sum;
    }
}
