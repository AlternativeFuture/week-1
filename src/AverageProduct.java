import java.util.Scanner;

public class AverageProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st num ");
        byte b = scanner.nextByte();
        System.out.print("Input 2nd num ");
        short c = scanner.nextShort();
        System.out.print("Input 3nd num ");
        int a = scanner.nextInt();
        System.out.println(a * b * c);
        float average = (a + b + c)/3f;
        System.out.println(average);
    }
}
