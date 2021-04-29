package Day_4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year_");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println("No");
        } else if ((year % 100 != 0)) {
            System.out.println("Yes");
        } else if ((year % 100 == 0) && (year % 400 == 0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
