package Day_5;

import java.util.Scanner;

public class TheGradeOfBased {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quiz score:     ");
        int quizScore = scanner.nextInt();
        System.out.print("Enter mid-term score: ");
        int midTermScore = scanner.nextInt();
        System.out.print("Enter Final score:    ");
        int finalScore = scanner.nextInt();
        System.out.print("Your grade is ");
        double average = (quizScore + midTermScore + finalScore)/3;
        System.out.print(average >= 80 ? "A": (average >= 60 ? "B" :(average >= 40)? "C":"else"));
    }
}
//Quiz score: 80
//Mid-term score: 68
//Final score: 90