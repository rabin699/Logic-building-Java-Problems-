// Problem 016: Write a program to assign grades based on marks.

import java.util.Scanner;

public class Problem016 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks of student:");
        float marks = scn.nextFloat();
        switch ((int) marks / 10) {
            case 10 -> System.out.println("Excellent 100 out of 100 wow");
            case 9 -> System.out.println("A+ grade");
            case 8 -> System.out.println("A grade");
            case 7 -> System.out.println("B+ grade");
            case 6 -> System.out.println("B grade");
            case 5 -> System.out.println("C+ grade");
            case 4 -> System.out.println("C grade");
            default -> System.out.println("Failed af");
        }
        scn.close();
    }
}