import java.util.Scanner;

public class SumOfDigits16_17_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3-digits number - ");
        int number = scanner.nextInt();
        int sum = 0;
        sum += number / 100;
        number = number % 100;
        sum += number / 10;
        number = number % 10;
        sum += number;
        System.out.println(sum);
    }
}
