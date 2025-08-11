// Problem 018: Write a menu-driven calculator using switch case.

import java.util.Scanner;

public class Problem018 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println("""
                Please choose the option based on Number:
                    1.Add(+)
                    2.Subtract(-)
                    3.Multiply(*)
                    4.Divide(/)
                    5.Mod(%)
                    """);
        int option = scn.nextInt();
        switch (option) {
            case 1 -> System.out.println("Sum:" + (num1 + num2));
            case 2 -> System.out.println("Sum:" + (num1 - num2));
            case 3 -> System.out.println("Sum:" + (num1 * num2));
            case 4 -> System.out.println("Sum:" + (num1 / num2));
            case 5 -> System.out.println("Sum:" + (num1 % num2));
            default -> System.out.println("Invalid case huhu :( ");
        }
        scn.close();
    }
}