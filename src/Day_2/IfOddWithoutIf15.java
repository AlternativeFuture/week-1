package Day_2;

import java.util.Scanner;

public class IfOddWithoutIf15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input checking number - ");
        int number = scanner.nextInt();
        boolean res = (number % 2 == 0);
        System.out.println(res);

    }
}
