// Problem 023: Write a program to compute x raised to the power y.

import java.util.Scanner;

public class Problem023 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x and y for (x^y)");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int temp = x;
        for (int i = 1; i <= y; i++) {
            x = x * temp;
        }
        System.out.println("X raised to power Y is:" + x);
        scn.close();
    }
}
