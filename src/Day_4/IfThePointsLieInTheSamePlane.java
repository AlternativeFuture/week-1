package Day_4;

import java.util.Scanner;

public class IfThePointsLieInTheSamePlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Input x1_");
        int x1 = scanner.nextInt();
        System.out.print("Input y1_");
        int y1 = scanner.nextInt();
        System.out.print("Input x2_");
        int x2 = scanner.nextInt();
        System.out.print("Input y2_");
        int y2 = scanner.nextInt();
        if (y1 > 0 && y2 > 0) {
            if (x1 > 0 && x2 > 0) {
                flag = true;
            } else if (x1 < 0 && x2 < 0) {
                flag = true;
            }
        } else if (y1 < 0 && y2 < 0) {
            if (x1 > 0 && x2 > 0) {
                flag = true;
            } else if (x1 < 0 && x2 < 0) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("In the same quarter.");
        } else {
            System.out.println("Not in the same quarter.");
        }
    }
}
