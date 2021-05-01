package Day_5;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        String a = scanner.nextLine();
        System.out.print("Input b_");
        String b = scanner.nextLine();
        System.out.println(a == b);
        System.out.println(a.equals(b));
        }
    }

