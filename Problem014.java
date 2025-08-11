// Problem 014: Write a program to check if a number is a palindrome.

import java.util.Scanner;

public class Problem014 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number please :");
        int num = scn.nextInt();
        int temp = num;
        int isPalindrome = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            isPalindrome = isPalindrome * 10 + remainder;
            temp /= 10;
        }
        if (isPalindrome == num) {
            System.out.println("The number is palindrome:" + num);
        } else {
            System.out.println("The number is not palindrome:" + num);
        }
        scn.close();
    }
}
