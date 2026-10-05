package IFStatement_SwitchCaseEx;

import java.util.Scanner;

public class IFSolution {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose your operation : 1 for addition , 2 for subtraction , 3 for multiplication ");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.print("the addition is : " + x + y);
        }
        else if (choice == 2){
            System.out.print("the subtraction is : " + (x - y));

        }
        else if (choice == 3){
            System.out.print("the multiplication is : " + (x * y));
        }
        else {
            System.out.print("wrong choice");
        }

    }
}
