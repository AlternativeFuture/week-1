package Day_5;

import java.util.Scanner;

public class TernaryOperator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.print("Input c_");
        int c = scanner.nextInt();

        System.out.println(a > b ? (a > c ? a : c):(b > c ? b : c )) ;

    }
}
