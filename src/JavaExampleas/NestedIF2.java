package JavaExampleas;

import java.util.Scanner;

public class NestedIF2 {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if (age >= 18) {
            if (age >= 21) {
                System.out.print("Full licence");
            }
            else {
                System.out.print("Temproray licence");
            }
        }
        else {
            System.out.print("too young");
        }
    }
}
