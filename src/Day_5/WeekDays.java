package Day_5;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Մուտքագրեք շաբաթվա օրվա համարը-");
        int num = scanner.nextInt();
        switch (num) {
            case (1):
                System.out.println("Երկուշաբթի");
                break;
            case (2):
                System.out.println("Երեքշաբթի");
                break;
            case (3):
                System.out.println("Չորեքշաբթի");
                break;
            case (4):
                System.out.println("Հինգշաբթի");
                break;
            case (5):
                System.out.println("Ուրբաթ");
                break;
            case (6):
                System.out.println("Շաբաթ");
                break;
            case (7):
                System.out.println("Կիրակի");
                break;
        }
    }
}
