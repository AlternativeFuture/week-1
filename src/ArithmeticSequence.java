import java.util.Scanner;

public class ArithmeticSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n - ");
        int n = scanner.nextInt();
        int res = 3 * n * n -12 * n;
        System.out.println(res);

    }
}
