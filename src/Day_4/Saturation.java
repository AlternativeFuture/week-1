package Day_4;

import java.util.Scanner;

public class Saturation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք սատուրաքցիան_");
        int saturation = scanner.nextInt();
        if (saturation == 98) {
            System.out.println("Դու առողջ ես");
        } else if (saturation < 30) {
            System.out.println("Պատրաստվի հանդիպել Աստծու հետ");
        } else if (saturation < 50) {
            System.out.println("Հրաժեշտ տուր հարազատներին");
        } else if (saturation < 70) {
            System.out.println("Ամեն դեպքում թարմացրու կտակտ)");
        } else if (saturation < 98) {
            System.out.println("Գնա բժշկի");
        } else {
            System.out.println("Թունել");
        }
    }
}
