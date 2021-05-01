package Day_4;

import java.util.Scanner;

public class CountOfNumbersThatEqualsToEachOther {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.print("Input c_");
        int c = scanner.nextInt();
        if (a == b) {
            i++;
        }
        if (a == c) {
            i++;
        } else if (c == b) {
            i++;
        }
        System.out.println(i);

    }
}
