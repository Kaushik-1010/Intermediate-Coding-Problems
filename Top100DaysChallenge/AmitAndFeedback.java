import java.util.Scanner;

public class AmitAndFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.contains("010") || s.contains("101"))
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
    }
}
