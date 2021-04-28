package Day_2;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st side ");
        int first = scanner.nextInt();
        System.out.print("Input 2nd side ");
        int second = scanner.nextInt();
        System.out.print("Input 3nd side ");
        int third = scanner.nextInt();
        System.out.println((first * second)/2);
    }
}
