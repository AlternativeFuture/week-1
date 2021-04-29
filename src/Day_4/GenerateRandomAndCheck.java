package Day_4;

import java.util.Random;

public class GenerateRandomAndCheck {
    public static void main(String[] args) {
        Random random = new Random();
        boolean flag = false;
        int num = random.nextInt();
        if ((num > -1000) && (num < 1000) && ((num % 5 == 0) || (num % 3 == 0))) {
            flag = true;
        }
        System.out.println(flag);

    }

}
