package IFStatement;

import java.util.Scanner;

public class ChatGptExercise {
    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        grade = input.nextInt();
        if ( grade >=50) {
            System.out.print("Pass ");
        }
        else
            System.out.print("Fail");


    }
}
