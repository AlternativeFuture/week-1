package Day_5;

import test_repo.Switch;

import java.util.Scanner;

public class IsAVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input letter_");
        String a = scanner.nextLine();
        a = a.toLowerCase();
        switch (a) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "y":
                System.out.println("A is  a Vowel");
                break;
            default:
                System.out.println("A isn`t  a Vowel");
        }
    }
}
