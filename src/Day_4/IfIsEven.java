package Day_4;

import java.util.Scanner;

public class IfIsEven {
    public static void main(String[] args) {
        System.out.print("Input checking number_");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else if (number % 2 == 1) {
            System.out.println("Number is odd.");
        }
    }
}
