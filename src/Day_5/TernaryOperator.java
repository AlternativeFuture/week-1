package Day_5;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.println(a < 0 ? "Negative" : "Positive") ;
        System.out.println(a < 0 ? "Negative" : (a == 0 ? "Zero" : "Positive"));
    }
}
