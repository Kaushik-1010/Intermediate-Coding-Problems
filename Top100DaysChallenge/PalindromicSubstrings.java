import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String a = scanner.next();
            String b = scanner.next();

            boolean hasCommonCharacter = checkForCommonCharacters(a, b);

            if (hasCommonCharacter) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean checkForCommonCharacters(String a, String b) {
        Set<Character> setA = new HashSet<>();

        for (char ch : a.toCharArray()) {
            setA.add(ch);
        }

        for (char ch : b.toCharArray()) {
            if (setA.contains(ch)) {
                return true;
            }
        }

        return false;
    }
}
