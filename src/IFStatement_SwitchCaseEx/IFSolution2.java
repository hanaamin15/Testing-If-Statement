package IFStatement_SwitchCaseEx;

import java.util.Scanner;

public class IFSolution2 {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = input.nextInt();
        System.out.print("Enter the second number: ");
        y = input.nextInt();
        System.out.print("Please choose your operation : 1 for addition , 2 for subtraction , 3 for multiplication ");
        int addition = x+y;
        int subtraction = x-y;
        int multiplication = x*y;


        int choice = input.nextInt();
        if (choice==1){
            System.out.print("the addition is:" + addition);


        }
        else if (choice==2) {
            System.out.print("the subtraction is: "+ subtraction);
        }


        else if (choice==3){
            System.out.print("the multiplication is:+" +multiplication);

        }
        else {
            System.out.print("wrong choice");
        }
    }
}
