package SyntaxConditionsLoops;

import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddNum = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(oddNum);
            sum += oddNum;
            oddNum += 2;
        }

        System.out.println("Sum: " + sum);
    }
}
