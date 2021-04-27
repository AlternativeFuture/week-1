import java.util.Scanner;

public class NumsModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st num ");
        int first = scanner.nextInt();
        System.out.print("Input 2nd num ");
        int second = scanner.nextInt();
        System.out.println(first % second);
    }
}
