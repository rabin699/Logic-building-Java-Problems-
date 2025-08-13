// Problem 021: Write a program to calculate factorial of a number.

import java.util.Scanner;

public class Problem021 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scn.nextInt();
        int factorial = facto(num);
        System.out.println("The factorial of number " + num + " is " + factorial);
        scn.close();
    }

    public static int facto(int n) {
        if (n <= 1)
            return 1;
        else
            return facto(n - 1) * n;
    }
}