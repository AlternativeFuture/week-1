package Day_4;

import java.util.Scanner;

public class sortingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
//        System.out.println(c <= a ? (c <= b ? c : b): (a <= b ? a : b));
//        System.out.println(b <= c ? (b >= a ? b : a): (b <= a ? b : a));
//        System.out.println(a >= b ? (a >= c ? a : c): (b >= c ? b : c));
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else if (c <= a && c <= b) {
            System.out.println(c);
        }
        if ((a >= b && a <= c) || (a >= c && a <= b) ) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            System.out.println(b);
        } else if ((c >= a && c <= b) || (c >= b && c <= a) ) {
            System.out.println(c);
        }
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else if (c >= a && c >= b) {
            System.out.println(c);
        }
    }
}
