package Day_2;

import java.util.Random;

public class RandomNumber13 {
    public static void main(String[] args) throws InterruptedException {
        double start = System.currentTimeMillis();
        Thread.sleep(10);
        Random random = new Random();
        int randomInt = random.nextInt(15);
        System.out.println(randomInt);
        double end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
