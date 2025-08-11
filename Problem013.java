// Problem 013: Write a program to check if a number is an Armstrong number.

import java.util.Scanner;

public class Problem013 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number please:");
        int num = scn.nextInt();
        int temp = num, tem1 = num, pow = 0;
        int isArmstrong = 0;
        while (temp != 0) {
            temp /= 10;
            pow++;
        }
        while (tem1 != 0) {
            int remainder = tem1 % 10;
            isArmstrong += Math.pow(remainder, pow);
            tem1 /= 10;
        }
        if (isArmstrong == num) {
            System.out.println("The number is Armstrong:" + num);
        } else {
            System.out.println("The number is not Armstrong:" + num);
        }
        scn.close();

    }

}
