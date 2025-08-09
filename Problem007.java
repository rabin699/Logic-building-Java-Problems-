// Problem 007: Write a program to evaluate cube of (a + b).

import java.util.Scanner;

public class Problem007 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers to find their (a+b)^3");
        int a = scn.nextInt();
        int b = scn.nextInt();
        double calculateCube = Math.pow(a, 3) + Math.pow(b, 3) + 3 * b * Math.pow(a, 2) + 3 * a * Math.pow(b, 2);
        System.out.println("The cube of (a+b) is: " + calculateCube);
        scn.close();
    }
}