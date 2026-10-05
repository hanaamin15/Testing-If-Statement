package JavaExampleas;

import java.util.Scanner;

public class IFElseEX2 {
    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        grade = input.nextInt();
        if (grade >= 85 ) {
            System.out.print("Excellent");
        }
        else if (grade >= 70 ) {
            System.out.print("Very Good");
        }
        else if (grade >= 50 ) {
            System.out.print("Good");

        }
        else if (grade < 50 ) {
            System.out.print("Fail");

        }
    }
}
