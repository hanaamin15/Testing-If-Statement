package JavaExampleas;

import java.util.Scanner;

public class NestedIF {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if (age > 0)
            if (age > 18)
                System.out.print("Welcome to the website");


            else
                System.out.print("you are too young to register");

        else
            System.out.print("invalid age");



            }

                    }




