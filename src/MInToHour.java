import java.util.Scanner;

public class MInToHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = scanner.nextDouble();
        double hour = min/60;
        System.out.println(hour);
    }
}
