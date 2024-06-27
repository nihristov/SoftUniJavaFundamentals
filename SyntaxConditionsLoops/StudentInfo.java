package SyntaxConditionsLoops;

import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        double grade = Double.parseDouble(input.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.02f", name, age, grade);
    }
}
