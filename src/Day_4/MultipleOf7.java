package Day_4;

import java.util.Scanner;

public class MultipleOf7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        if ((a % 7 == 0 || b % 7 == 0) && b > 0 && a > b) { flag = true;}
        System.out.println(flag);
    }
}
