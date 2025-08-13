// Problem 024: Write a program to generate Fibonacci series up to n terms.

import java.util.Scanner;

public class Problem024 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter then number of terms:");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        scn.close();
    }

    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
