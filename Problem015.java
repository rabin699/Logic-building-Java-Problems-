// Problem 015: Write a program to find the largest among 3 numbers.

import java.util.Scanner;

public class Problem015 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is largest among three numbers.");
        } else if (b > c) {
            System.out.println(b + " is largest among three numbers.");
        } else {
            System.out.println(c + " is largest among three numbers.");
        }
        scn.close();
    }
}