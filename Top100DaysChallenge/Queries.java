import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Set<Integer> s = new LinkedHashSet<Integer>();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            if (n == 1) {
                s.add(a);
            } else if (n == 2) {
                if (s.contains(a))
                    s.remove(a);
            } else if (n == 3) {
                if (s.contains(a))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }

        }
    }
}