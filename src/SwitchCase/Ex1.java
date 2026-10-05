package SwitchCase;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value between 1 & 5");
        grade = input.nextInt();
        switch (grade) {
            case 1:
                System.out.println("the value is one ");
                break;
            case 2:
                System.out.println("the value is two ");
                break;
            case 3:
                System.out.println("the value is three ");
                break;
            case 4:
                System.out.println("the value is four ");
                break;
            case 5:
                System.out.println("the value is five ");
                break;
        }

    }
}
