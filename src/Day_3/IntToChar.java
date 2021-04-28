package Day_3;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input int in range 32 to 127");
        int num = scanner.nextInt();
        char char1 = (char)num;
        System.out.println(char1 + "-" + num);
    }
}
