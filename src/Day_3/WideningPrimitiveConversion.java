package Day_3;

import java.util.Scanner;

public class WideningPrimitiveConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte byteInput = scanner.nextByte();
        short convShort = byteInput;
        int convInt = convShort;
        long convLong = convInt;
        float convFloat = convLong;
        System.out.println("byte to short " + byteInput + " " + convShort);
        System.out.println("short to int " + convShort + " " + convInt);
        System.out.println("int to long " + convInt + " " + convLong);
        System.out.println("long to float " + convLong + " " + convFloat);
        System.out.println("float to double " + convFloat + " " + (double) convFloat);
    }
}
