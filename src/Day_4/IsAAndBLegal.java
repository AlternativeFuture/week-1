package Day_4;

import java.util.Scanner;

public class IsAAndBLegal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("No legal");
        }
        if ((a > 0) && (b > 0)) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("No legal");
        }
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("No legal");
        }
        if ((a > 10) && (b < 1) && (a % 2 != 0) && (b % 2 != 0)) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("No legal");
        }
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("No legal");
        }
        if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("No legal");
        }
    }
}
