package Day_4;

import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 5, y = 3;
        int balls = scanner.nextInt();
        if (((balls % x) % y == 0) || ((balls % y) % x == 0) || ((balls > x) && (balls % x) % y == 1)
                || ((balls > 2*x) && (balls % x) % y == 2))  {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
