package Day_4;

import java.util.Random;

public class RandomWithoutBound {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        if (num < 0) { num *= -1; }
        System.out.println((num % 6) + 2);
    }
}
