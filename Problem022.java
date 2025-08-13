// Problem 022: Write a program to print multiplication table of a number.

import java.util.Scanner;

public class Problem022 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number for it's multiplication table:");
        int num = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        scn.close();
    }
}