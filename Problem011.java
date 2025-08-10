// Problem 011: Write a program to find distance between two points.

import java.util.Scanner;

public class Problem011 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.println("Enter the first coordinates (x,y):");
        x1 = scn.nextInt();
        y1 = scn.nextInt();
        System.out.println("Enter the second coordinates (x1,y1):");
        x2 = scn.nextInt();
        y2 = scn.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("The distance between(%d,%d) and (%d,%d) is %.2f units ", x1, y1, x2, y2, distance);
        scn.close();
    }
}