import java.util.Scanner;

public class SumDifferanceAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st num ");
        int first = scanner.nextInt();
        System.out.print("Input 2nd num ");
        int second = scanner.nextInt();
        System.out.print("Input 3nd num ");
        int third = scanner.nextInt();
        System.out.println(first + second + third);
        System.out.println(first - second - third);
        float average = (first + second + third)/3f;
        System.out.println(average);
    }
}
