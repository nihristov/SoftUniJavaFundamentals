package SyntaxConditionsLoops;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                System.out.println("The number is: " + Math.abs(number));
                flag = false;
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
