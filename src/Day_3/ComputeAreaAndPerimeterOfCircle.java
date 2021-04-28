package Day_3;

import java.util.Scanner;

public class ComputeAreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * pi;
        double area = radius*radius * pi;
        System.out.println("perimeter=" + perimeter);
        System.out.println("area= " + area);
    }
}
