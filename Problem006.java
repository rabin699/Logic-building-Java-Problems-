// Problem 006: Write a program to swap two numbers using a third variable.

import java.util.Scanner;

public class Problem006 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("The original values are A:" + a + " B:" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The changed values are A:" + a + " B:" + b);
        scn.close();
    }
}