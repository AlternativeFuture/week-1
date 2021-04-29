package Day_4;

import java.util.Scanner;

public class CirclePerimeterArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 4;
        int response = scanner.nextInt();
        if (response == 1) {
            System.out.println(2 * Math.PI * radius);
        }  else if (response == 2) {
            System.out.println( Math.PI * Math.pow(radius,2));
        }
    }
}
