package Day_4;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        System.out.print("Input age_");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Person is eligible to vote.");
        }
    }
}
