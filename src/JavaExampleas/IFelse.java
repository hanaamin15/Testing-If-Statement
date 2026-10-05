package JavaExampleas;

import java.util.Scanner;

public class IFelse {
    public static void  main(String[] args) {
        int Salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your salary: ");
        Salary = input.nextInt();
        if  (Salary < 4000) {
            System.out.print("No taxes added ");


    }
        else if (Salary < 6000) {
            System.out.print("10% taxes added ");
        }
        else if (Salary >= 6000) {
            System.out.print("25% taxes added ");
        }

    }
}
