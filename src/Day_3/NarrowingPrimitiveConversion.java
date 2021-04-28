package Day_3;

import java.util.Scanner;

public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double convDouble = scanner.nextByte();
        float convFloat = (float)convDouble;
        long convLong = (long)convFloat;
        int convInt = (int)convLong;
        short convShort = (short) convInt;
        byte convByte = (byte) convShort;
        System.out.println("double to float " + convDouble + " " + convFloat);
        System.out.println("float to long " + convFloat + " " + convLong);
        System.out.println("long to int " + convLong + " " + convInt);
        System.out.println("int to short " + convInt + " " + convShort);
        System.out.println("short to byte " + convShort + " " + convByte);
    }
}