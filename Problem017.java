// Problem 017: Write a program to check whether a year is a leap year.

import java.util.Scanner;

public class Problem017 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year to check if it is leap year:");
        int year = scn.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is leap year ");
        } else {
            System.out.println("The number is not a leap year ");
        }
        scn.close();
    }
}