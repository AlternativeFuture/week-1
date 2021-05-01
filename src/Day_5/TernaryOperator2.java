package Day_5;

import java.util.Scanner;

public class TernaryOperator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.println(a < b ? b : a) ;
        System.out.println(a < 0 ? -a : a);
    }
}
