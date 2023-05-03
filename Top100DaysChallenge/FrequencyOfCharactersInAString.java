package from13thDay;

import java.util.Scanner;

public class FrequencyOfCharactersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        frequencyOfCharacters(str);
    }

    private static void frequencyOfCharacters(String str) {
        int[] frequency = new int[str.length()];
        char strNew[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (strNew[i] == strNew[j]) {
                    frequency[i]++;
                    strNew[j] = '0';
                }
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (strNew[i]!= ' ' && strNew[i]!= '0')
                System.out.println(strNew[i] + "-" + frequency[i]);
        }


    }
}
