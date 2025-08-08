// Problem 003: Write a program to find area and circumference of a circle.

import java.util.Scanner;

public class Problem003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float radious, area, circumference;
        System.out.println("Enter the radious of the circle:");
        radious = scn.nextFloat();
        area = (float) Math.PI * (float) Math.pow(radious, 2);
        circumference = (float) Math.PI * 2 * radious;
        System.out.println("Circle of radious " + radious + " has area: " + area);
        System.out.println("Circle of radious " + radious + " has circumference: " + circumference);
        scn.close();
    }
}