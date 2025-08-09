// Problem 010: Write a program to convert seconds into hh:mm:ss format.

import java.util.Scanner;

public class Problem010 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the seconds to convet in to hh:mm:ss format:");
        int seconds = scn.nextInt();
        int min = seconds / 60;
        seconds = seconds % 60;
        int hours = min / 60;
        min = min % 60;
        System.out.println("hh:mm:ss is: " + hours + ":" + min + ":" + seconds);
        scn.close();
    }
}