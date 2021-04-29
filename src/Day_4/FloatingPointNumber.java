package Day_4;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input floating-point number_");
        double inputNum = scanner.nextDouble();
        if (inputNum < 1 && inputNum > -1) {
            System.out.println("Small");
        } else if (inputNum == 0) {
            System.out.println("Zero");
        } else if (inputNum >= 1 && inputNum < 1000000) {
            System.out.println("Positive");
        } else if (inputNum <= -1) {
            System.out.println("Negative");
        }
    }
}
