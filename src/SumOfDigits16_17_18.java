import java.util.Scanner;

public class SumOfDigits16_17_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3-digits number - ");
        int number = scanner.nextInt();
        int sum = number % 10 + number / 10 % 10 + number / 100;
        System.out.println(sum);
    }
}
