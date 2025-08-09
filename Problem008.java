// Problem 008: Write a program to solve a quadratic equation (assume real
// roots).

import java.util.Scanner;

public class Problem008 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your equation(ax² + bx + c = 0) values:(a,b,c)");
        int a, b, c;
        while (true) {
            a = scn.nextInt();
            b = scn.nextInt();
            c = scn.nextInt();
            if (a == 0) {
                System.out.println("Enter your values again(a≠0)");
            }
            if (a != 0) {
                break;
            }
        }
        scn.close();
        int discriminant = (int) Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Roots are imaginary .");
            return;
        }
        float x = (float) (-b + Math.sqrt(discriminant)) / (2 * a);
        float x1 = (float) (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("The values of x are:" + x + " and " + x1);

    }
}
