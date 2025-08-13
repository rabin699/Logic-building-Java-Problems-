// Problem 025: Write a program to print cube of numbers divisible by 3.

import java.util.Scanner;

public class Problem025 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth terms:");
        int n = scn.nextInt();
        System.out.println("The numbers divisible by 3 raised to their power is:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print((int) Math.pow(i, 3) + " ");
            }
        }
        scn.close();
    }
}