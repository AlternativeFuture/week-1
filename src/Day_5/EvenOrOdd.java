package Day_5;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int a = scanner.nextInt();

        switch (a % 2) {
            case 0:
                System.out.println("Even.");
                break;
            default:
                System.out.println("Odd.");
        }
    }
}
