package Day_4;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Մուտքագրեք շաբաթվա օրվա համարը-");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Երկուշաբթի");
        } else if (num == 2) {
            System.out.println("Երեքշաբթի");
        } else if (num == 3 ) {
            System.out.println("Չորեքշաբթի");
        } else if (num == 4) {
            System.out.println("Հինգշաբթի");
        } else if (num == 5) {
            System.out.println("Ուրբաթ");
        } else if (num == 6) {
            System.out.println("Շաբաթ");
        } else if (num == 7) {
            System.out.println("Կիրակի");
        }
    }
}
