package Day_5;

import java.util.Scanner;

public class TernaryOperator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                           " a. int 1x=10;\n" +
                           " b. int x=10;\n" +
                           " c. float x=10.0f;\n" +
                           " d. string x=\"10\";");
        System.out.print("Choose the correct answer of a question. _");
        String a = scanner.nextLine();
        System.out.println(a.equals("b") ? "Congratulation!": "Invalid choice!");


    }
}
