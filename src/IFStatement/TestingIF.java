package IFStatement;

import java.util.Scanner;

public class TestingIF {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if (age > 13) {
            System.out.println("You are eligible to register");
            System.out.println("You can also register using mobile App");
        }
        else
            System.out.println("Sorry you are too young to register");



    }
}
