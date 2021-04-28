package Day_2;

import java.util.Random;

public class Random800_1500 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(800);
        System.out.println(randomInt + 700);
    }
}