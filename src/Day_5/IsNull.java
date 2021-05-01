package Day_5;

import java.util.Scanner;

public class IsNull {
    public static void main(String[] args) {
        String str = "";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input string_");
//        String str = scanner.nextLine();
        System.out.println(str == null ? -1:(str.equals("") ? 0:1));
    }
}
