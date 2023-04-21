package from13thDay;

import java.util.Scanner;

public class DoubleOfAGivenNumberWithoutUsingArthimeticOperator {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(doubleOfNumber(n));
    }

    private static int doubleOfNumber(int n) {
        int res=0;
        res=n<<1; //left shift operator is used to double the number without using arthmetic operator
        return res;
    }
}
