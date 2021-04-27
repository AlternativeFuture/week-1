import java.util.Random;

public class RandomNumber14 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(15);
        System.out.println(randomInt + 15);
    }
}
