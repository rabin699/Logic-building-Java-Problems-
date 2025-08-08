// Problem 002: Write a program to convert Fahrenheit to Celsius.

import java.util.Scanner;

public class Problem002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.println("Enter Fahrenheit Temperature: ");
        fahrenheit = scn.nextFloat();
        celsius = (float) 9 / 5 * fahrenheit + 32; // (explicit conversion to float using (float))
        System.out.println(fahrenheit + " fahrenheit in celcious is " + celsius);
        scn.close();
    }
}