// Problem 004: Write a program to calculate volume of a cylinder.

import java.util.Scanner;

public class Problem004 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double radious, height;
        System.out.println("""
                 _______
                |       |  |
                |       |  |
                |       |  |-->  Height
                |_______|  |
                    ---->radious
                """);
        System.out.println("Enter the radious and height of cylinder");
        radious = scn.nextDouble();
        height = scn.nextDouble();
        double volume = Math.PI * Math.pow(radious, 2) * height;
        System.out.println("The volume of cylinder of height " + height + " and radious " + radious + " is " + volume);
        scn.close();
    }
}