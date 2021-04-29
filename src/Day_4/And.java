package Day_4;

import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if ((input > 10) && (input < 100)) {
            System.out.println("100 > number > 10");
        } else if ((input > 200) && (input < 300))
        {System.out.println("300 > number > 200");
        } else if ((input > 300) && (input < 500)) {
            System.out.println("500 > number > 300");
        }

    }
}
