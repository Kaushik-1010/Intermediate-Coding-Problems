package from13thDay;

import java.util.Scanner;

public class AddFractions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first fraction (numerator/denominator): ");
        int num1 = input.nextInt();
        int den1 = input.nextInt();

        System.out.print("Enter the second fraction (numerator/denominator): ");
        int num2 = input.nextInt();
        int den2 = input.nextInt();


        int lcm = den1 * den2;
        int temp1 = lcm / den1;
        int temp2 = lcm / den2;


        int sum = (num1 * temp1) + (num2 * temp2);


        int gcd = 1;
        for (int i = 1; i <= sum && i <= lcm; i++) {
            if (sum % i == 0 && lcm % i == 0) {
                gcd = i;
            }
        }


        int numerator = sum / gcd;
        int denominator = lcm / gcd;

        System.out.println("The sum is: " + numerator + "/" + denominator);
    }
}
