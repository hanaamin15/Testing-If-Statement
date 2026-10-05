package IFStatement;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the salary: ");
        salary = input.nextInt();
        if (salary >= 5000) {
            System.out.print("Your bonus is 1000");

        }
        else
            System.out.print("Your bonus is 500");

    }
}
