// Problem 020: Write a program to check if a number is prime.

import java.util.Scanner;

public class Problem020 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int num = scn.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            System.out.println("The number is not prime ");
            scn.close();
            return;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is prime ");
        } else {
            System.out.println("The number is not prime ");
        }
        scn.close();
    }
}