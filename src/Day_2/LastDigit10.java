package Day_2;

import java.util.Scanner;

public class LastDigit10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number _ ");
        int number = scanner.nextInt();
        System.out.println(number % 10);
    }
}
