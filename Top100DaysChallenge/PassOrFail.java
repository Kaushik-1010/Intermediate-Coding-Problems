import java.util.Scanner;

/*

PROBLEM STATEMENT:
Anusree is struggling to pass a certain college course.
The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Anusree is a risk-averse person so he decided to attempt all the questions. It is known that Anusree got X questions correct and the rest of them incorrect. For Anusree to pass the course he must score at least P marks.
Will Anusree be able to pass the exam or not?
Input Format:
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three integers N, X, P.
Output Format:
For each test case output ""PASS"" if Chef passes the exam and ""FAIL"" if Chef fails the exam.

 */

public class PassOrFail {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []a = new int[t];
        int []b = new int[t];
        int []c = new int[t];
        for(int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for(int i = 0; i < t; i++) {
            int marks = (3 * b[i]) + (-1 * (a[i] - b[i]));
            if (marks >= c[i])
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
    }
}
