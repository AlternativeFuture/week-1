package Day_4;

import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (inputNum % 5 == 0) {
            System.out.println("This number is a multiple of 5.");
        } else {
            System.out.println("This number isn`t a multiple of 5.");
        }
    }
}
