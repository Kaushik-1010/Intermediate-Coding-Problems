package com.Top100DaysChallenge;

import java.util.Scanner;

public class NumberOfDaysInAGivenMonthOfTheYear {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(numberOfDaysInAGivenMonth(month, year));
    }

    private static int numberOfDaysInAGivenMonth(int month, int year) {
        if (month == 2) {
            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
