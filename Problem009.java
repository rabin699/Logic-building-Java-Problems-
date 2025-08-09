// Problem 009: Write a program to input n days and convert to
// years/months/days.

import java.util.Scanner;

public class Problem009 {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int days;
        System.out.println("Enter the days to convert to years/months/days");
        days = scn.nextInt();
        int months = days / 30;
        days = days % 30;
        int years = months / 12;
        months = months % 12;
        System.out.println("years/months/days:" + years + "/" + months + "/" + days);
        scn.close();
    }
}
