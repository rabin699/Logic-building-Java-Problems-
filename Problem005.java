// Problem 005: Write a program to calculate Simple Interest and Compound
// Interest.

import java.util.Scanner;

public class Problem005 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float principle, interest, rate;
        int time = 0;
        System.out.println("Enter the amount(Nrs.) rate(%)");
        principle = scn.nextFloat();
        rate = scn.nextFloat();

        System.out.println("""
                    Time:
                    1.Months(Press 1)
                    2.Year(Press 2)
                """);
        int option = scn.nextInt();
        if (option == 1) {
            System.out.println("Enter your time in months:");
            time = scn.nextInt();
            interest = (float) (principle * time / 12.0 * rate) / 100;
            System.out.println("Calculated interest in " + time + " months is Nrs. " + interest);
        }
        if (option == 2) {
            interest = (float) (principle * time * rate) / 100;
            System.out.println("Calculated interest in " + time + " years is Nrs. " + interest);
        }
        scn.close();
    }

}
