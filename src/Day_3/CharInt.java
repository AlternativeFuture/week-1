package Day_3;

public class CharInt {
    public static void main(String[] args) {
        char hChar = 'H';
        char oChar = 'o';
        char vChar = 'v';
        char aChar = 'a';
        char nChar = 'n';
        char eChar = 'e';
        char sChar = 's';
        int birthYear = 1987;

        String name = String.valueOf(hChar);
        name = name + oChar + vChar + hChar + aChar + nChar + nChar + eChar + sChar;
        System.out.println(name + " " + birthYear);

    }
}
