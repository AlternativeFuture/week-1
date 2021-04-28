package Day_3;

public class NameLettersToIntegers {
    public static void main(String[] args) {
        String name = "Ara";
        int letter1 = name.charAt(0);
        int letter2 = name.charAt(1);
        int letter3 = name.charAt(2);
        System.out.println(name + "-" + (float)(letter1 + letter2 + letter3)/3);
    }
}
