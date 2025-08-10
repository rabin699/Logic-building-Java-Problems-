// Problem 012: Write a program to check whether a number is even or odd.

import java.util.Scanner;

public class Problem012 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        System.out.println("Enter a number to check if its even or odd");
        number = scn.nextInt();
        scn.close();
        if (number <= 0) {
            System.out.println("The number is neither odd nor even " + number);
            return;
        }
        if (number % 2 == 0) {
            System.out.println("The number is even: " + number);
        } else {
            System.out.println("The number is odd: " + number);
        }

    }
}