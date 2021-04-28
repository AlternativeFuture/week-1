package Day_3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("C-" + celsius + " F-" + fahrenheit);
        float floatCelsius = (float) celsius;
        int intCelsius = (int) floatCelsius;
        System.out.println("float celsius " + floatCelsius);
        System.out.println("int celsius " + intCelsius);
    }
}
