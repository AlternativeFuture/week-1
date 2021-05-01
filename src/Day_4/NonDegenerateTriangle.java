package Day_4;

import java.util.Scanner;

public class NonDegenerateTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x_");
        int x = scanner.nextInt();
        System.out.print("Input y_");
        int y = scanner.nextInt();
        System.out.print("Input z_");
        int z = scanner.nextInt();
        if (x + y > z && x + z >y && y + z > x ) {
            System.out.println("There is a non-degenerate triangle.");
        } else {
            System.out.println("Impossible");
        }
    }
}
