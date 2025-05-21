import java.util.Scanner;

public class Ex07ReversedChars {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);

        char one = sc.nextLine().charAt(0);
        char two = sc.nextLine().charAt(0);
        char three = sc.nextLine().charAt(0);

        String string = String.format("%c " + "%c " + "%c", three, two, one);
        System.out.println(string);
    }
}
