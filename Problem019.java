// Problem 019: Write a program to check whether a triangle is valid and its
// type.

import java.util.Scanner;

public class Problem019 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle a,b,c");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle is valid :");
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral triangle:");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isoceles triangle:");
            } else {
                System.out.println("THe number is Scalene triangle");
            }
        } else {
            System.out.println("The triangle is not valid :");
        }
        scn.close();
    }
}