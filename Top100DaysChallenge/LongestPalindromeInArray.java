import java.util.Scanner;

public class LongestPalindromeInArray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in array");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largestPalindrome = largestPal(arr, n);
        System.out.println("Largest Palindrome in the array: " + largestPalindrome);
    }

    public static boolean check(int n) {
        int div = 1;
        while (n / div >= 10)
            div *= 10;
        while (n != 0) {
            int x = n / div;
            int y = n % 10;
            if (x != y)
                return false;
            n = (n % div) / 10;
            div = div / 100;
        }
        return true;
    }

    public  static int largestPal(int []arr, int n) {
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > res && check(arr[i]))
                res = arr[i];
        }
        return res;
    }
}
