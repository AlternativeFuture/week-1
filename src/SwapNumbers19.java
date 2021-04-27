import java.util.Scanner;

public class SwapNumbers19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = a + b;      //a = 100 + 200 = 300
        b = a - b;      //b = 300 - 200 = 100
        a = a - b;      //a = 300 - 100 = 200;

        System.out.println(a);
        System.out.println(b);
    }
}
