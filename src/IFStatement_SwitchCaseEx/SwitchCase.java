package IFStatement_SwitchCaseEx;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        x = input.nextInt();
        System.out.print("Please enter the second number: ");
        y = input.nextInt();
        System.out.print("Please choose your operation : 1 for addition , 2 for subtraction , 3 for multiplication ");
        int choice = input.nextInt();

        int addition = x+y;
        int subtraction = x-y;
        int multiplication = y*y;

        switch(choice) {
            case 1:
                System.out.print("The addition is " + addition);
                break;
            case 2:
                System.out.print("The subtraction is " + subtraction);
                break;
            case 3:
                System.out.print("The multiplication is " + multiplication);
                break;
            default:
                System.out.print("Invalid choice");

        }
    }
}
